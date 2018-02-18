package com.example.bara.akbara_1202154377_modul2;

import android.app.Dialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.text.format.DateFormat;
import android.widget.TimePicker;

import java.util.Calendar;

public class TimePickerFragment extends DialogFragment implements TimePickerDialog.OnTimeSetListener {
    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        // Melakukan waktu default
        final Calendar c = Calendar.getInstance();
        int jam = c.get(Calendar.HOUR_OF_DAY);
        int menit = c.get(Calendar.MINUTE);

        // Membuat Time PickerDialog
        return new TimePickerDialog(getActivity(), this, jam, menit,
                DateFormat.is24HourFormat(getActivity()));
    }

    @Override
    public void onTimeSet(TimePicker timePicker, int i, int i1) {

        // Melakukan set pada Take Away
        TakeAway activity = (TakeAway) getActivity();
        // Invoke Main Activity's processTimePickerResult() method.
        activity.processTimePickerResult(i, i1);
    }
}