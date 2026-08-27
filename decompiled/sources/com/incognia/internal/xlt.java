package com.incognia.internal;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import java.nio.ByteBuffer;
import o.onContentCardClicked;

/* JADX INFO: loaded from: classes2.dex */
public abstract class xlt {
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public static final String BGx(Drawable drawable) {
        Bitmap bitmapCreateScaledBitmap;
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            if (bitmapDrawable.getBitmap() != null) {
                bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapDrawable.getBitmap(), 50, 50, false);
            } else {
                bitmapCreateScaledBitmap = null;
            }
        } else {
            bitmapCreateScaledBitmap = null;
        }
        if (bitmapCreateScaledBitmap == null) {
            return null;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bitmapCreateScaledBitmap.getHeight() * bitmapCreateScaledBitmap.getRowBytes());
        bitmapCreateScaledBitmap.copyPixelsToBuffer(byteBufferAllocate);
        byte[] bArrArray = byteBufferAllocate.array();
        Lql lql = new Lql();
        lql.BGx(bArrArray);
        return onContentCardClicked.IconCompatParcelizer(lql.BGx(), VM.BGx);
    }
}
