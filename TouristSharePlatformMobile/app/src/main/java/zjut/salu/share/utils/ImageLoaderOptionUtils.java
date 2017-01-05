package zjut.salu.share.utils;

import android.graphics.Bitmap;

import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.display.RoundedBitmapDisplayer;

import zjut.salu.share.R;

/**
 * Created by Salu on 2016/11/17.
 */

public class ImageLoaderOptionUtils {
    public static DisplayImageOptions getImgOptions() {
        DisplayImageOptions imgOptions = new DisplayImageOptions.Builder()
                .cacheOnDisk(true)
                .cacheInMemory(true)
                .bitmapConfig(Bitmap.Config.RGB_565)
                .showImageOnLoading(R.drawable.timeline_image_loading)
                .showImageForEmptyUri(R.drawable.timeline_image_loading)
                .showImageOnFail(R.drawable.timeline_image_failure)
                .build();
        return imgOptions;
    }
    public static DisplayImageOptions getNineImgOptions() {
        DisplayImageOptions imgOptions = new DisplayImageOptions.Builder()
                .cacheOnDisk(true)
                .cacheInMemory(true)
                .bitmapConfig(Bitmap.Config.RGB_565)
                .showImageOnLoading(R.drawable.avatar_default)
                .showImageForEmptyUri(R.drawable.avatar_default)
                .showImageOnFail(R.drawable.avatar_default)
                .build();
        return imgOptions;
    }

    public static DisplayImageOptions getAvatarOptions() {
        DisplayImageOptions	avatarOptions = new DisplayImageOptions.Builder()
                .cacheOnDisk(true)
                .cacheInMemory(true)
                .bitmapConfig(Bitmap.Config.RGB_565)
                .showImageOnLoading(R.drawable.avatar_default)
                .showImageForEmptyUri(R.drawable.avatar_default)
                .showImageOnFail(R.drawable.avatar_default)
                .displayer(new RoundedBitmapDisplayer(999))
                .build();
        return avatarOptions;
    }

    public static DisplayImageOptions getCornerOptions(int cornerRadiusPixels) {
        DisplayImageOptions options = new DisplayImageOptions.Builder()
                .cacheOnDisk(true)
                .cacheInMemory(true)
                .bitmapConfig(Bitmap.Config.RGB_565)
                .showImageOnLoading(R.drawable.timeline_image_loading)
                .showImageForEmptyUri(R.drawable.timeline_image_loading)
                .showImageOnFail(R.drawable.timeline_image_loading)
                .displayer(new RoundedBitmapDisplayer(cornerRadiusPixels)).build();
        return options;
    }
}
