package com.wd.message.view;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.wd.message.R;

public class GroupListSearchView extends LinearLayout {

    private EditText editText;
    private ImageView imageView;

    public GroupListSearchView(Context context) {
        super(context);
        init(context);
    }

    public GroupListSearchView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }
    private void init(Context context) {
        View view=View.inflate(context,R.layout.group_list_search_view,null);
        editText=view.findViewById(R.id.group_list_search);
        imageView=view.findViewById(R.id.group_list_edit);
        addView(view);
    }
}
