package com.myjarvis.mytoast;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.Button;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.toolbar)
    Toolbar mainActivityToolbar;


    @Bind(R.id.generateToastButton)
    Button generateToastButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        setSupportActionBar(mainActivityToolbar);

//        generateToastButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                MyCustomToast.show(MainActivity.this, "This is myCustomToast ", true);
//            }
//        });
    }


  @OnClick(R.id.generateToastButton)
    public void generateToastButtonClicked(){
      MyCustomToast.show(MainActivity.this, "This is myCustomToast ", true);
  }
}
