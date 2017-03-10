package com.customtoastapplication;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.customtoastlibrary.model.ToastItem;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button mSuccess,mError,mWarning;
    private ToastItem toastItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSuccess = (Button)findViewById(R.id.btn_success);
        mError = (Button)findViewById(R.id.btn_error);
        mWarning = (Button)findViewById(R.id.btn_warning);

        mSuccess.setOnClickListener(this);
        mError.setOnClickListener(this);
        mWarning.setOnClickListener(this);


        toastItem = new ToastItem.Builder(Toast.LENGTH_SHORT)
                .build();
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch(id){
            case R.id.btn_success:
                toastItem.showSuccessToast(this);
                break;

            case R.id.btn_error:
                toastItem.showErrorToast(this);
                break;

            case R.id.btn_warning:
                toastItem.showWarningError(this);
                break;

        }
    }
}
