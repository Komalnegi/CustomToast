package com.customtoastlibrary.model;

import android.content.Context;
import android.graphics.Color;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.customtoastlibrary.R;

/**
 * Created by hp on 3/8/2017.
 */

public class ToastItem {
    private static ToastItem toastItem;
    private final String toastName;
    private final int toastDuration;
    private final Gravity toastGravity;

    private ToastItem(Builder builder){
        this.toastName = builder.toastName;
        this.toastDuration = builder.toastDuration;
        this.toastGravity = builder.toastGravity;
    }

    public static class Builder {
        private String toastName;
        private final int toastDuration ;
        private Gravity toastGravity ;

        public Builder(int toastDuration) {
            this.toastDuration = toastDuration;
        }

        public Builder setDuration(String toastName){
            this.toastName = toastName;
            return this;
        }

        public Builder setGravity(Gravity toastGravity){
            this.toastGravity = toastGravity;
            return this;
        }

        public ToastItem build(){
           return new ToastItem(this);
        }
    }

    public void showErrorToast(Context context , String message ){
        LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View layout = inflater.inflate(R.layout.error_toast, null);

        TextView text = (TextView) layout.findViewById(R.id.txt_error__toast);
        text.setText(message);

        Toast toast = new Toast(context);
        toast.setDuration(toastDuration);
        toast.setView(layout);
        toast.show();
    }

    public void showSuccessToast(Context context , String message){
        LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View layout = inflater.inflate(R.layout.success_toast, null);

        TextView text = (TextView) layout.findViewById(R.id.txt_success_toast);
        text.setText(message);

        Toast toast = new Toast(context);
        toast.setDuration(toastDuration);
        toast.setView(layout);
        toast.show();
    }

    public void showWarningError(Context context ,String message){
        LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View layout = inflater.inflate(R.layout.warning_toast, null);

        TextView text = (TextView) layout.findViewById(R.id.txt_warning__toast);
        text.setText(message);

        Toast toast = new Toast(context);
        toast.setDuration(toastDuration);
        toast.setView(layout);
        toast.show();
    }
}
