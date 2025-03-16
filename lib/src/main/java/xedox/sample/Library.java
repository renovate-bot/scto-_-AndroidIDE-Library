package xedox.sample;

import android.content.Context;
import android.widget.TextView;

public class Library {
    public static TextView getView(Context context) {
        TextView view = new TextView(context);
        view.setText("Hello!");
        return view;
    }
}
