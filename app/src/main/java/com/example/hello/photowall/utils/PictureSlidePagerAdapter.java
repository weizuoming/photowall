package com.example.hello.photowall.utils;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.hello.photowall.model.Images;
import com.example.hello.photowall.views.PictureSlideFragment;

/**
 * Created by 韦作铭 on 2018/3/8.
 */

public class PictureSlidePagerAdapter extends FragmentStatePagerAdapter
{
    private int init_index=-1;
    private boolean firstIn=true;
    public PictureSlidePagerAdapter(FragmentManager fm, int index) {
        super(fm);
        init_index=index;
    }

    @Override
    public Fragment getItem(int position)
    {
        if(firstIn)
        {
            firstIn=false;
            return PictureSlideFragment.getInstance(Images.imageUrls[init_index]);
        }
        return PictureSlideFragment.getInstance(Images.imageUrls[position]);
    }

    @Override
    public int getCount() {
        return Images.imageUrls.length;
    }

    @Override
    public int getItemPosition(Object object) {
        return super.getItemPosition(object);
    }
}
