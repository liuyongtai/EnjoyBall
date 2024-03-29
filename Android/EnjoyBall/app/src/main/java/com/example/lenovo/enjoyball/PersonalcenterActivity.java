package com.example.lenovo.enjoyball;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class PersonalcenterActivity extends AppCompatActivity {

    private ImageView ivPersonalcenterPortrait;
    private ImageView ivPersonalcenterComment;
    private ImageView ivPersonalcenterFollow;
    private ImageView ivPersonalcenterFans;

    private TextView tvPersonalcenterNickname;
    private TextView tvPersonalcenterSignature;

    private LinearLayout llPersonalcenterData;
    private LinearLayout llPersonalcneterTeam;
    private LinearLayout llPersonalcneterYueqiu;
    private LinearLayout llPersonalcneterCollect;
    private LinearLayout llPersonalcneterVip;
    private LinearLayout llPersonalcneterFeedback;
    private LinearLayout llPersonalcenterLogout;

    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(R.style.nonetitle);
        setContentView(R.layout.activity_personalcenter);

        findView();

        setListeners();

    }

    private class PersonalcenterListener implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.iv_personalcenter_portrait:
                    //点击头像
                    intent=new Intent();
                    intent.setClass(PersonalcenterActivity.this,HomepageActivity.class);
                    startActivity(intent);
                    break;
                case R.id.iv_personalcenter_comment:
                    //点击评论图片
                    intent=new Intent();
                    intent.setClass(PersonalcenterActivity.this,HomepageActivity.class);
                    intent.putExtra("tag","comment");
                    startActivity(intent);
                    break;
                case R.id.iv_personalcenter_follow:
                    //点击关注图片
                    intent=new Intent();
                    intent.setClass(PersonalcenterActivity.this,HomepageActivity.class);
                    intent.putExtra("tag","follow");
                    startActivity(intent);
                    break;
                case R.id.iv_personalcenter_fans:
                    //点击粉丝图片
                    intent=new Intent();
                    intent.setClass(PersonalcenterActivity.this,HomepageActivity.class);
                    intent.putExtra("tag","fans");
                    startActivity(intent);
                    break;
                case R.id.tv_personalcenter_nickname:
                    //点击用户名
                    intent=new Intent();
                    intent.setClass(PersonalcenterActivity.this,HomepageActivity.class);
                    startActivity(intent);
                    break;
                case R.id.tv_personalcenter_signature:
                    //点击个性签名
                    break;
                case R.id.ll_personalcenter_data:
                    //点击个人资料
                    intent=new Intent();
                    intent.setClass(PersonalcenterActivity.this,PerinfoActivity.class);
                    startActivity(intent);
                    break;
                case R.id.ll_personalcenter_team:
                    //点击球队
                    intent=new Intent();
                    intent.setClass(PersonalcenterActivity.this,TeamActivity.class);
                    startActivity(intent);
                    break;
                case R.id.ll_personalcenter_yueqiu:
                    //点击约球
                    break;
                case R.id.ll_personalcenter_collect:
                    //点击收藏
                    break;
                case R.id.ll_personalcenter_vip:
                    //点击vip
                    break;
                case R.id.ll_personalcenter_feedback:
                    //点击反馈
                    break;
                case R.id.ll_personalcenter_logout:
                    //点击注销
                    break;

            }
        }
    }

    private void setListeners() {

        PersonalcenterListener personalcenterListener=new PersonalcenterListener();

        ivPersonalcenterPortrait.setOnClickListener(personalcenterListener);
        ivPersonalcenterComment.setOnClickListener(personalcenterListener);
        ivPersonalcenterFollow.setOnClickListener(personalcenterListener);
        ivPersonalcenterFans.setOnClickListener(personalcenterListener);

        tvPersonalcenterNickname.setOnClickListener(personalcenterListener);
        tvPersonalcenterSignature.setOnClickListener(personalcenterListener);

        llPersonalcenterData.setOnClickListener(personalcenterListener);
        llPersonalcneterTeam.setOnClickListener(personalcenterListener);
        llPersonalcneterYueqiu.setOnClickListener(personalcenterListener);
        llPersonalcneterCollect.setOnClickListener(personalcenterListener);
        llPersonalcneterVip.setOnClickListener(personalcenterListener);
        llPersonalcneterFeedback.setOnClickListener(personalcenterListener);
        llPersonalcenterLogout.setOnClickListener(personalcenterListener);

    }

    private void findView() {

        ivPersonalcenterPortrait=findViewById(R.id.iv_personalcenter_portrait);
        ivPersonalcenterComment=findViewById(R.id.iv_personalcenter_comment);
        ivPersonalcenterFollow=findViewById(R.id.iv_personalcenter_follow);
        ivPersonalcenterFans=findViewById(R.id.iv_personalcenter_fans);

        tvPersonalcenterNickname=findViewById(R.id.tv_personalcenter_nickname);
        tvPersonalcenterSignature=findViewById(R.id.tv_personalcenter_signature);

        llPersonalcenterData=findViewById(R.id.ll_personalcenter_data);
        llPersonalcneterTeam=findViewById(R.id.ll_personalcenter_team);
        llPersonalcneterYueqiu=findViewById(R.id.ll_personalcenter_yueqiu);
        llPersonalcneterCollect=findViewById(R.id.ll_personalcenter_collect);
        llPersonalcneterVip=findViewById(R.id.ll_personalcenter_vip);
        llPersonalcneterFeedback=findViewById(R.id.ll_personalcenter_feedback);
        llPersonalcenterLogout=findViewById(R.id.ll_personalcenter_logout);

    }

}
