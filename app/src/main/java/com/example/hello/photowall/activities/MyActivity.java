package com.example.hello.photowall.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.example.hello.photowall.R;

public class MyActivity extends AppCompatActivity {

//    private Button btn_gridView;
//    private Button btn_recyclerView;
    private Button btn_own_scrollView;
    private Toolbar toolbar;
    private Button btn_choose_local;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);

        toolbar= (Toolbar) findViewById(R.id.myToolbar);
        //setSupportActionBar(toolbar);

        btn_choose_local = findViewById(R.id.btn_choose_local);

//        btn_gridView= (Button) findViewById(R.id.btn_gridView);
//        btn_recyclerView= (Button) findViewById(R.id.btn_recyclerView);
        btn_own_scrollView= (Button) findViewById(R.id.btn_own_scrollView);

//        btn_gridView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent=new Intent(getBaseContext(),MainActivity.class);
//                startActivity(intent);
//            }
//        });
//        btn_recyclerView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent=new Intent(getBaseContext(),WaterfallFlowUseRecyclerViewActivity.class);
//                startActivity(intent);
//            }
//        });
        btn_own_scrollView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getBaseContext(),WaterfallFlowActivity.class);
                startActivity(intent);
            }
        });
        btn_choose_local.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getBaseContext(),PicViewerActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.more, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        return super.onOptionsItemSelected(item);
    }
}
