package com.framgia.retrofit2kotlin;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import com.framgia.retrofit2kotlin.databinding.PostActivityBinding;

/**
 * Created by superme198 on 05,May,2019
 * in Retrofit2Kotlin.
 */
public class PostActivity extends AppCompatActivity {

    private PostActivityBinding mBinding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initComponents();
    }

    private void initComponents() {
        mBinding = DataBindingUtil.setContentView(this, R.layout.post_activity);
    }
}
