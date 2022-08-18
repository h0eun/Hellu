package com.example.HelluApp.PlanReview;

import android.app.Activity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import android.widget.Toast;

import com.example.HelluApp.R;

public class plan_evaluation extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //타이틀바 없애기
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_plan_evaluation);

        TextView textView = findViewById(R.id.popup_title);
        textView.setText(R.string.plan_evaluation_text);
    }

    // 확인 버튼 클릭 시
    public void mOnClose(View view) {
        // 창 닫기
        finish();

        // 토스트 메시지
        Toast.makeText(this.getApplicationContext(), R.string.plan_evaluation_thankU_text, Toast.LENGTH_SHORT).show();
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        //바깥레이어 클릭시 안닫히게
        return event.getAction() != MotionEvent.ACTION_OUTSIDE;
    }
}