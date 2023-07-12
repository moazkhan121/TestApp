package com.usmanejaz.examapp;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;

import java.util.List;

public class MyViewAdapter extends ArrayAdapter<Question> {

    public MyViewAdapter(@NonNull Context context, List<Question> studentArrayList)
    {super(context, 0, studentArrayList);}

    @SuppressLint("ResourceAsColor")
    @Override public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent)
    {
        Question student = getItem(position);
        convertView = LayoutInflater.from(getContext()).
                inflate(R.layout.mylistviewlayout, parent, false);
        LinearLayout layout = convertView.findViewById(R.id.layout);
        TextView textViewQuestion =  convertView.findViewById(R.id.textViewQuestion);
        TextView textViewQuestionNo = convertView.findViewById(R.id.textViewQuestionNo);
        TextView textViewCorrectAnswer = convertView.findViewById(R.id.textViewCorrectAnswer);
        TextView textViewStatus = convertView.findViewById(R.id.textViewStatus);

        textViewQuestion.setText(student.question);
        textViewQuestionNo.setText("Question " + student.questionNo );
        textViewCorrectAnswer.setText( student.correctAnswer);
        textViewStatus.setText(student.status);

    if(student.status.equals("Correct")){
        layout.setBackgroundColor(ContextCompat.getColor(getContext(), R.color.green));
        textViewStatus.setTextColor(ContextCompat.getColor(getContext(), R.color.green_dark));
    }
    else{
        layout.setBackgroundColor(ContextCompat.getColor(getContext(), R.color.red));
        textViewStatus.setTextColor(ContextCompat.getColor(getContext(), R.color.red_dark));
    }

        return convertView;
    }


}