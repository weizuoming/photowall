package com.example.hello.photowall.views;

import android.content.Context;
import android.view.View;
import android.widget.ListView;

import com.example.hello.photowall.R;
import com.example.hello.photowall.model.ImageInfo;

import java.util.List;

/**
 * Created by 韦作铭 on 2018/3/8.
 */

public class ListImageDirPopupWindow extends BasePopupWindowForListView<ImageInfo>{

    // 布局文件的最外层View
    protected View mContentView;
    protected Context context;

    private ListView mListDir;
    public ListImageDirPopupWindow(int width, int height, List<ImageInfo> datas, View convertView)
    {
        super(convertView, width, height, true, datas);
        mContentView=convertView;
    }

    @Override
    protected void beforeInitWeNeedSomeParams(Object... params) {

    }

    @Override
    public void initViews() {
        mListDir = (ListView)mContentView.findViewById(R.id.id_list_dir);
    }

    @Override
    public void initEvents() {

    }

    @Override
    public void init() {

    }


    //选中监听器接口类
    public interface OnImageDirSelected
    {
        void selected(ImageInfo info);
    }
    private OnImageDirSelected mImageDirSelected;
    public void setOnImageDirSelected(OnImageDirSelected mImageDirSelected)
    {
        this.mImageDirSelected = mImageDirSelected;
    }

}
