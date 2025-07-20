package com.example.wat;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ViewFlipper;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    static int i = 0;
    //public static String[] Queue;
    ViewFlipper vf;
    Queue queue = null;
    static int front;
    static int rear;
    InputMethodManager im;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        front = -1;
        rear = -1;

        Button submit = findViewById(R.id.submit);
        Button start = findViewById(R.id.start);
        Button reset = findViewById(R.id.reset);
        Button next = findViewById(R.id.next);
        Button startTest = findViewById(R.id.startTest);
        TextView t = findViewById(R.id.serial);
        TextView tex1 = findViewById(R.id.text1);
        TextView text = findViewById(R.id.textView1);
        EditText et = findViewById(R.id.words);
//        EditText et1 = findViewById(R.id.upperLimit);
        im = (InputMethodManager) this.getSystemService(Activity.INPUT_METHOD_SERVICE);
        vf = findViewById(R.id.enterword);

        submit.setOnClickListener(view -> {
            if(!et.getText().toString().equals("")){
                im.hideSoftInputFromWindow(view.getWindowToken(), 0);
                queue.enqueue(et.getText().toString());
                t.setText(String.format(Locale.getDefault(),"%s",("S.no. - "+(++i))));
                et.setText("");
            }else if (et.getText().toString().equals("")) {
                et.setError("The field cannot be empty");
            }
        });

        start.setOnClickListener(view ->{
            t.setText(String.format(Locale.getDefault(),"%s",("S.no. - "+(++i))));
            text.setVisibility(View.GONE);
            vf.showNext();
        });

        reset.setOnClickListener(view ->{front = -1;
            rear = -1;
            i = 0;
            queue = null;
            queue = new Queue();
            Queue.length = 0;
            t.setText(String.format(Locale.getDefault(),"%s",("S.no. - "+(++i))));
        });

        next.setOnClickListener(view ->{
            im.hideSoftInputFromWindow(view.getWindowToken(), 0);
            if (queue.isEmpty() == true) {
                et.setError("Submit atleast 1 word");
            }
            else {
                view = this.getCurrentFocus();
                if (view == null) view = new View(this);
                im.hideSoftInputFromWindow(view.getWindowToken(), 0);
                // t.setVisibility(View.GONE);
                //et.setVisibility(View.GONE);
                if (Queue.length == 1) {
                    tex1.setText("Note:-   Test will consists of 1 word which will be shown for 15 seconds.");
                } else {
                    tex1.setText("Note:-   Test will consists of " + (Queue.length) + " words which will be shown one by one at regular interval of 15 seconds.");
                }
                // submit.setPadding(24,0,24,0);
                //  submit.setTextSize(20);
                reset.setVisibility(View.GONE);
                submit.setVisibility(View.GONE);
                tex1.setVisibility(View.VISIBLE);
                vf.showNext();
                //  submit.setText("BEGIN TEST");
            }
        });

        startTest.setOnClickListener(view -> {
                Intent iq = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(iq);
            finish(); // TO FINISH THIS ACTIVITY
        });

    }

    protected void onStart() {
        super.onStart();
        front = -1;
        rear = -1;
        i = 0;
        queue = null;
        queue = new Queue();
        Queue.length = 0;
    }

    //QUEUE ENQUEUE OPERATION
//    private static void enqueue(String s){
//        if(rear == size-1)
//            System.out.println("Queue Overflow");
//        else {
//            rear++;
//            Queue[rear] = s;
//            if(front == -1){
//                front = 0;
//            }
//        }
//    }
//    public static String dequeue(){
//        String temp = "";
//        if(front == -1) {
//            System.out.println("Queue Underflow");
//            return "flag";
//        }
//        else{
//            temp = Queue[front];
//            if(front == rear){
//                front = -1;
//                rear = -1;
//            }else{
//                front = front + 1;
//            }
//        }
//        return temp;
//    }
}

class Node {
    String data;
    Node next;

    Node(String new_data) {
        this.data = new_data;
        this.next = null;
    }
}
class Queue {
    static int length = 0;
    static Node front, rear;

    Queue() {
        front = rear = null;
    }

    static boolean isEmpty() {

        return front == null && rear == null;
    }

    //ENQUEUE OPERATION
    static void enqueue(String new_data) {

        Node new_node = new Node(new_data);

        if (rear == null) {
            front = rear = new_node;
            ++length;
            return;
        }

        rear.next = new_node;
        rear = new_node;
        ++length;
    }

    //DEQUEUE OPERATION
    static String dequeue() {

        if (isEmpty()) {
            System.out.println("Queue Underflow");
            return "stop";
        }
        Node temp = front;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        return temp.data;
    }
}