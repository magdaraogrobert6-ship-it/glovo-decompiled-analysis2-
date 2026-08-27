package com.github.gcacace.signaturepad.views;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import androidx.camera.video.Recorder$3;
import androidx.compose.ui.graphics.Fields;
import androidx.transition.TransitionValuesMaps;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.huawei.hmf.tasks.a.i$d;
import com.roadrunner.customerchat.selfservice.domain.SelfServiceCustomerChatRepositoryImpl$sendMessage$2;
import com.roadrunner.delivery.pickupdropoff.tasks.presentation.signature.CustomerSignatureFragment;
import com.roadrunner.diagnostics.domain.SendTestPushUseCase;
import java.util.ArrayList;
import java.util.List;
import o.Key;
import o.accessgetAcp;
import o.onPreInterceptKeyBeforeSoftKeyboardZmokQxo;
import o.r8lambdaLssewuUnwz__zuwPAhaX4NMGewA;
import o.setOnEvent;
import o.setOnPreEvent;

/* JADX INFO: loaded from: classes2.dex */
public class SignaturePad extends View {
    private static int r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = 1;
    private static int r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
    public Bitmap ComponentActivity;
    public int IconCompatParcelizer;
    public long MediaBrowserCompatMediaItem;
    public Boolean MediaDescriptionCompat;
    public boolean MediaMetadataCompat;
    public float MediaSessionCompatQueueItem;
    public float MediaSessionCompatResultReceiverWrapper;
    public int MediaSessionCompatToken;
    public float ParcelableVolumeInfo;
    public float PlaybackStateCompat;
    public int PlaybackStateCompatCustomAction;
    public final RectF RatingCompat;
    public final boolean RemoteActionCompatParcelizer;
    public final Paint ResultReceiver;
    public setOnPreEvent r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public ArrayList r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public final ArrayList r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public final i$d r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
    public float r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
    public Canvas r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
    public final TransitionValuesMaps read;
    public Bitmap serializer;
    public final Recorder$3 write;

    public static /* synthetic */ Object serializer(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i2;
        int i8 = ~i6;
        int i9 = ~(i7 | i8 | i3);
        int i10 = ~i3;
        int i11 = i9 | (~(i7 | i10 | i6));
        int i12 = (~(i3 | i8)) | i7 | (~(i10 | i6));
        int i13 = i2 + i6 + i + (1112421973 * i5) + ((-1897213938) * i4);
        int i14 = i13 * i13;
        int i15 = ((1216318437 * i2) - 781189120) + ((-1395624931) * i6) + (i11 * (-1305971684)) + ((-1305971684) * i8) + (1305971684 * i12) + ((-89653248) * i) + ((-1446510592) * i5) + (892338176 * i4) + ((-1657864192) * i14);
        int i16 = (i2 * 2010092721) + 1217064380 + (i6 * 2010090761) + (i11 * (-980)) + (i8 * (-980)) + (i12 * 980) + (i * 2010091741) + (i5 * (-1378896031)) + (i4 * 856652822) + (i14 * 563281920);
        if (i15 + (i16 * i16 * (-1077346304)) != 1) {
            return serializer(objArr);
        }
        SignaturePad signaturePad = (SignaturePad) objArr[0];
        Canvas canvas = (Canvas) objArr[1];
        int i17 = 2 % 2;
        Bitmap bitmap = signaturePad.ComponentActivity;
        if (bitmap != null) {
            int i18 = r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 + 91;
            r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = i18 % Fields.SpotShadowColor;
            int i19 = i18 % 2;
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, signaturePad.ResultReceiver);
            int i20 = r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 + 27;
            r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = i20 % Fields.SpotShadowColor;
            int i21 = i20 % 2;
        }
        return null;
    }

    public List<setOnEvent> getPoints() {
        int i = 2 % 2;
        int i2 = r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 + 19;
        int i3 = i2 % Fields.SpotShadowColor;
        r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = i3;
        int i4 = i2 % 2;
        ArrayList arrayList = this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        int i5 = i3 + 37;
        r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return arrayList;
    }

    public final boolean read() {
        int i = 2 % 2;
        int i2 = r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 + 3;
        r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.MediaMetadataCompat;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setOnSignedListener(setOnPreEvent setonpreevent) {
        int i = 2 % 2;
        int i2 = r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 + 121;
        int i3 = i2 % Fields.SpotShadowColor;
        r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = i3;
        int i4 = i2 % 2;
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = setonpreevent;
        int i5 = i3 + 59;
        r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
    }

    public void setVelocityFilterWeight(float f) {
        int i = 2 % 2;
        int i2 = r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
        int i3 = i2 + 111;
        r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = f;
        int i5 = i2 + 37;
        r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
    }

    public Bitmap getTransparentSignatureBitmap() {
        int i = 2 % 2;
        int i2 = r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 + 79;
        r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            serializer();
            return this.ComponentActivity;
        }
        serializer();
        throw null;
    }

    public void setPenColor(int i) {
        int i2 = 2 % 2;
        int i3 = r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 + 5;
        r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            this.ResultReceiver.setColor(i);
            return;
        }
        this.ResultReceiver.setColor(i);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setMaxWidth(float f) {
        int i = 2 % 2;
        int i2 = r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 + 7;
        r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            this.PlaybackStateCompatCustomAction = RemoteActionCompatParcelizer(f);
            int i3 = 53 / 0;
        } else {
            this.PlaybackStateCompatCustomAction = RemoteActionCompatParcelizer(f);
        }
        int i4 = r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 + 65;
        r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 39 / 0;
        }
    }

    public void setMinWidth(float f) {
        int i = 2 % 2;
        int i2 = r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 + 29;
        r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.MediaSessionCompatToken = RemoteActionCompatParcelizer(f);
        int i4 = r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 + 91;
        r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    public SignaturePad(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = new i$d(21);
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = new ArrayList();
        this.write = new Recorder$3(24);
        this.read = new TransitionValuesMaps(13, false);
        Paint paint = new Paint();
        this.ResultReceiver = paint;
        this.ComponentActivity = null;
        this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = null;
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, onPreInterceptKeyBeforeSoftKeyboardZmokQxo.SignaturePad, 0, 0);
        try {
            this.MediaSessionCompatToken = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, RemoteActionCompatParcelizer(3.0f));
            this.PlaybackStateCompatCustomAction = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, RemoteActionCompatParcelizer(7.0f));
            paint.setColor(typedArrayObtainStyledAttributes.getColor(1, -16777216));
            this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = typedArrayObtainStyledAttributes.getFloat(4, 0.9f);
            this.RemoteActionCompatParcelizer = typedArrayObtainStyledAttributes.getBoolean(0, false);
            typedArrayObtainStyledAttributes.recycle();
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeCap(Paint.Cap.ROUND);
            paint.setStrokeJoin(Paint.Join.ROUND);
            this.RatingCompat = new RectF();
            RemoteActionCompatParcelizer();
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final int RemoteActionCompatParcelizer(float f) {
        int i = 2 % 2;
        int i2 = r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 + 7;
        r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = i2 % Fields.SpotShadowColor;
        return Math.round(i2 % 2 == 0 ? getContext().getResources().getDisplayMetrics().density % f : getContext().getResources().getDisplayMetrics().density * f);
    }

    public void setPenColorRes(int i) {
        int i2 = 2 % 2;
        int i3 = r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 + 27;
        r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = i3 % Fields.SpotShadowColor;
        try {
            if (i3 % 2 == 0) {
                setPenColor(getResources().getColor(i));
                int i4 = 58 / 0;
            } else {
                setPenColor(getResources().getColor(i));
            }
            int i5 = r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 + 27;
            r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = i5 % Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                int i6 = 93 / 0;
            }
        } catch (Resources.NotFoundException unused) {
            setPenColor(Color.parseColor("#000000"));
        }
    }

    private void setIsEmpty(boolean z) {
        int i = 2 % 2;
        int i2 = r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
        int i3 = i2 + 3;
        r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        this.MediaMetadataCompat = z;
        setOnPreEvent setonpreevent = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        if (setonpreevent != null) {
            if (!z) {
                ((CustomerSignatureFragment) ((SendTestPushUseCase) setonpreevent).serializer).MediaDescriptionCompat();
                int i5 = r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 + 41;
                r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                return;
            }
            int i7 = i2 + 121;
            r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = i7 % Fields.SpotShadowColor;
            if (i7 % 2 != 0) {
                ((CustomerSignatureFragment) ((SendTestPushUseCase) setonpreevent).serializer).MediaDescriptionCompat();
            } else {
                ((CustomerSignatureFragment) ((SendTestPushUseCase) setonpreevent).serializer).MediaDescriptionCompat();
                int i8 = 51 / 0;
            }
        }
    }

    public final void serializer() {
        int i = 2 % 2;
        int i2 = r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 + 83;
        r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (this.ComponentActivity == null) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
            this.ComponentActivity = bitmapCreateBitmap;
            this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = new Canvas(bitmapCreateBitmap);
        }
        int i3 = r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 + 99;
        r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = i3 % Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            int i4 = 19 / 0;
        }
    }

    public Bitmap getSignatureBitmap() {
        int i = 2 % 2;
        Bitmap transparentSignatureBitmap = getTransparentSignatureBitmap();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(transparentSignatureBitmap.getWidth(), transparentSignatureBitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.drawColor(-1);
        canvas.drawBitmap(transparentSignatureBitmap, 0.0f, 0.0f, (Paint) null);
        int i2 = r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 + 119;
        r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return bitmapCreateBitmap;
    }

    public final setOnEvent read(float f, float f2) {
        setOnEvent setonevent;
        int i = 2 % 2;
        int i2 = r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 + 95;
        r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        ArrayList arrayList = this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        int size = arrayList.size();
        if (size == 0) {
            setonevent = new setOnEvent();
            int i4 = r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 + 79;
            r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
        } else {
            setonevent = (setOnEvent) arrayList.remove(size - 1);
        }
        setonevent.IconCompatParcelizer = f;
        setonevent.serializer = f2;
        setonevent.write = System.currentTimeMillis();
        return setonevent;
    }

    public final void serializer(float f, float f2) {
        int i = 2 % 2;
        int i2 = r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 + 17;
        r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        float fMin = Math.min(this.MediaSessionCompatQueueItem, f);
        RectF rectF = this.RatingCompat;
        rectF.left = fMin;
        rectF.right = Math.max(this.MediaSessionCompatQueueItem, f);
        rectF.top = Math.min(this.ParcelableVolumeInfo, f2);
        rectF.bottom = Math.max(this.ParcelableVolumeInfo, f2);
        int i4 = r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 + 17;
        r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0031  */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        int i = 2 % 2;
        Bundle bundle = new Bundle();
        bundle.putParcelable("superState", super.onSaveInstanceState());
        Boolean bool = this.MediaDescriptionCompat;
        if (bool != null) {
            int i2 = r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 + 97;
            r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                int i3 = 86 / 0;
                if (bool.booleanValue()) {
                    this.serializer = getTransparentSignatureBitmap();
                    int i4 = r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 + 125;
                    r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = i4 % Fields.SpotShadowColor;
                    int i5 = i4 % 2;
                }
            } else if (bool.booleanValue()) {
                this.serializer = getTransparentSignatureBitmap();
                int i6 = r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 + 125;
                r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
            }
        } else {
            this.serializer = getTransparentSignatureBitmap();
            int i8 = r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 + 125;
            r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
        }
        bundle.putParcelable("signatureBitmap", this.serializer);
        return bundle;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        int i = 2 % 2;
        if (parcelable instanceof Bundle) {
            int i2 = r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 + 59;
            r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                Bundle bundle = (Bundle) parcelable;
                setSignatureBitmap((Bitmap) bundle.getParcelable("signatureBitmap"));
                this.serializer = (Bitmap) bundle.getParcelable("signatureBitmap");
                bundle.getParcelable("superState");
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Bundle bundle2 = (Bundle) parcelable;
            setSignatureBitmap((Bitmap) bundle2.getParcelable("signatureBitmap"));
            this.serializer = (Bitmap) bundle2.getParcelable("signatureBitmap");
            parcelable = bundle2.getParcelable("superState");
        }
        this.MediaDescriptionCompat = Boolean.FALSE;
        super.onRestoreInstanceState(parcelable);
        int i3 = r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 + 67;
        r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
    }

    public final void RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        i$d i_d = this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
        ((StringBuilder) i_d.serializer).setLength(0);
        i_d.read = null;
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = new ArrayList();
        this.PlaybackStateCompat = 0.0f;
        this.MediaSessionCompatResultReceiverWrapper = (this.MediaSessionCompatToken + this.PlaybackStateCompatCustomAction) / 2;
        if (this.ComponentActivity != null) {
            int i2 = r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 + 23;
            r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            this.ComponentActivity = null;
            serializer();
            int i4 = r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 + 87;
            r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
        }
        setIsEmpty(true);
        invalidate();
        int i6 = r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 + 53;
        r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = i6 % Fields.SpotShadowColor;
        if (i6 % 2 != 0) {
            throw null;
        }
    }

    public String getSignatureSvg() {
        int i = 2 % 2;
        int i2 = r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 + 113;
        r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int width = getTransparentSignatureBitmap().getWidth();
        int height = getTransparentSignatureBitmap().getHeight();
        i$d i_d = this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
        TransitionValuesMaps transitionValuesMaps = (TransitionValuesMaps) i_d.read;
        StringBuilder sb = (StringBuilder) i_d.serializer;
        if (transitionValuesMaps != null) {
            int i4 = r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 + 53;
            r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                sb.append(transitionValuesMaps);
                throw null;
            }
            sb.append(transitionValuesMaps);
        }
        StringBuilder sbM = m1$$ExternalSyntheticOutline0.m(height, width, "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\"?>\n<svg xmlns=\"http://www.w3.org/2000/svg\" version=\"1.2\" baseProfile=\"tiny\" height=\"", "\" width=\"", "\" viewBox=\"0 0 ");
        r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.IconCompatParcelizer(width, height, " ", "\"><g stroke-linejoin=\"round\" stroke-linecap=\"round\" fill=\"none\" stroke=\"black\">", sbM);
        sbM.append((CharSequence) sb);
        sbM.append("</g></svg>");
        return sbM.toString();
    }

    public final Recorder$3 write(setOnEvent setonevent, setOnEvent setonevent2, setOnEvent setonevent3) {
        int i = 2 % 2;
        float f = setonevent.IconCompatParcelizer;
        float f2 = setonevent2.IconCompatParcelizer;
        float f3 = f - f2;
        float f4 = setonevent.serializer;
        float f5 = setonevent2.serializer;
        float f6 = f4 - f5;
        float f7 = setonevent3.IconCompatParcelizer;
        float f8 = f2 - f7;
        float f9 = setonevent3.serializer;
        float f10 = f5 - f9;
        float f11 = (f + f2) / 2.0f;
        float f12 = (f4 + f5) / 2.0f;
        float f13 = (f2 + f7) / 2.0f;
        float f14 = (f5 + f9) / 2.0f;
        float fSqrt = (float) Math.sqrt((f6 * f6) + (f3 * f3));
        float fSqrt2 = (float) Math.sqrt((f10 * f10) + (f8 * f8));
        float f15 = fSqrt2 / (fSqrt + fSqrt2);
        if (Float.isNaN(f15)) {
            int i2 = r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
            int i3 = i2 + 21;
            r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            int i5 = i2 + 21;
            r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            f15 = 0.0f;
        }
        float f16 = setonevent2.IconCompatParcelizer - (((f11 - f13) * f15) + f13);
        float f17 = setonevent2.serializer - (((f12 - f14) * f15) + f14);
        setOnEvent setonevent4 = read(f11 + f16, f12 + f17);
        setOnEvent setonevent5 = read(f13 + f16, f14 + f17);
        Recorder$3 recorder$3 = this.write;
        recorder$3.MediaBrowserCompatMediaItem = setonevent4;
        recorder$3.RemoteActionCompatParcelizer = setonevent5;
        return recorder$3;
    }

    public void setSignatureBitmap(Bitmap bitmap) {
        int i = 2 % 2;
        int i2 = r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 + 53;
        r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            isLaidOut();
            throw null;
        }
        if (!isLaidOut()) {
            getViewTreeObserver().addOnGlobalLayoutListener(new accessgetAcp(this, bitmap));
            return;
        }
        RemoteActionCompatParcelizer();
        serializer();
        RectF rectF = new RectF();
        RectF rectF2 = new RectF();
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int width2 = getWidth();
        int height2 = getHeight();
        rectF.set(0.0f, 0.0f, width, height);
        rectF2.set(0.0f, 0.0f, width2, height2);
        Matrix matrix = new Matrix();
        matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
        new Canvas(this.ComponentActivity).drawBitmap(bitmap, matrix, null);
        setIsEmpty(false);
        invalidate();
        int i3 = r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 + 107;
        r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            int i4 = 75 / 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x002e, code lost:
    
        if (r13 != 2) goto L10;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r13) {
        /*
            Method dump skipped, instruction units count: 310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.gcacace.signaturepad.views.SignaturePad.onTouchEvent(android.view.MotionEvent):boolean");
    }

    private static /* synthetic */ Object serializer(Object[] objArr) {
        SignaturePad signaturePad;
        SignaturePad signaturePad2 = (SignaturePad) objArr[0];
        setOnEvent setonevent = (setOnEvent) objArr[1];
        int i = 2 % 2;
        int i2 = r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 + 125;
        r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        signaturePad2.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.add(setonevent);
        int size = signaturePad2.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.size();
        if (size > 3) {
            Recorder$3 recorder$3Write = signaturePad2.write((setOnEvent) signaturePad2.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.get(0), (setOnEvent) signaturePad2.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.get(1), (setOnEvent) signaturePad2.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.get(2));
            setOnEvent setonevent2 = (setOnEvent) recorder$3Write.RemoteActionCompatParcelizer;
            setOnEvent setonevent3 = (setOnEvent) recorder$3Write.MediaBrowserCompatMediaItem;
            ArrayList arrayList = signaturePad2.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
            arrayList.add(setonevent3);
            Recorder$3 recorder$3Write2 = signaturePad2.write((setOnEvent) signaturePad2.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.get(1), (setOnEvent) signaturePad2.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.get(2), (setOnEvent) signaturePad2.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.get(3));
            setOnEvent setonevent4 = (setOnEvent) recorder$3Write2.MediaBrowserCompatMediaItem;
            arrayList.add((setOnEvent) recorder$3Write2.RemoteActionCompatParcelizer);
            setOnEvent setonevent5 = (setOnEvent) signaturePad2.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.get(1);
            setOnEvent setonevent6 = (setOnEvent) signaturePad2.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.get(2);
            TransitionValuesMaps transitionValuesMaps = signaturePad2.read;
            transitionValuesMaps.MediaBrowserCompatMediaItem = setonevent5;
            transitionValuesMaps.MediaDescriptionCompat = setonevent2;
            transitionValuesMaps.MediaMetadataCompat = setonevent4;
            transitionValuesMaps.RatingCompat = setonevent6;
            long j = setonevent6.write - setonevent5.write;
            if (j <= 0) {
                j = 1;
            }
            float fSqrt = ((float) Math.sqrt(Math.pow(setonevent5.serializer - setonevent6.serializer, 2.0d) + Math.pow(setonevent5.IconCompatParcelizer - setonevent6.IconCompatParcelizer, 2.0d))) / j;
            if (Float.isInfinite(fSqrt) || Float.isNaN(fSqrt)) {
                fSqrt = 0.0f;
            }
            if (Float.isNaN(fSqrt)) {
                int i4 = r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 + 29;
                r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                fSqrt = 0.0f;
            }
            float f = signaturePad2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
            float f2 = ((1.0f - f) * signaturePad2.PlaybackStateCompat) + (fSqrt * f);
            float fMax = Math.max(signaturePad2.PlaybackStateCompatCustomAction / (f2 + 1.0f), signaturePad2.MediaSessionCompatToken);
            float f3 = signaturePad2.MediaSessionCompatResultReceiverWrapper;
            i$d i_d = signaturePad2.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
            i_d.getClass();
            Integer numValueOf = Integer.valueOf(Math.round((f3 + fMax) / 2.0f));
            Key key = new Key((setOnEvent) transitionValuesMaps.MediaBrowserCompatMediaItem);
            setOnEvent setonevent7 = (setOnEvent) transitionValuesMaps.MediaDescriptionCompat;
            int iRound = Math.round(setonevent7.IconCompatParcelizer);
            int iRound2 = Math.round(setonevent7.serializer);
            setOnEvent setonevent8 = (setOnEvent) transitionValuesMaps.MediaMetadataCompat;
            int iRound3 = Math.round(setonevent8.IconCompatParcelizer);
            int iRound4 = Math.round(setonevent8.serializer);
            Key key2 = new Key((setOnEvent) transitionValuesMaps.RatingCompat);
            if (((TransitionValuesMaps) i_d.read) == null) {
                i_d.read = new TransitionValuesMaps(key, numValueOf);
            }
            if (!key.equals((Key) ((TransitionValuesMaps) i_d.read).RatingCompat) || !numValueOf.equals((Integer) ((TransitionValuesMaps) i_d.read).MediaDescriptionCompat)) {
                ((StringBuilder) i_d.serializer).append((TransitionValuesMaps) i_d.read);
                i_d.read = new TransitionValuesMaps(key, numValueOf);
            }
            TransitionValuesMaps transitionValuesMaps2 = (TransitionValuesMaps) i_d.read;
            StringBuilder sb = (StringBuilder) transitionValuesMaps2.MediaBrowserCompatMediaItem;
            Key key3 = (Key) transitionValuesMaps2.RatingCompat;
            String str = Integer.valueOf(iRound - key3.serializer.intValue()) + "," + Integer.valueOf(iRound2 - key3.RemoteActionCompatParcelizer.intValue());
            Key key4 = (Key) transitionValuesMaps2.RatingCompat;
            String str2 = Integer.valueOf(iRound3 - key4.serializer.intValue()) + "," + Integer.valueOf(iRound4 - key4.RemoteActionCompatParcelizer.intValue());
            Key key5 = (Key) transitionValuesMaps2.RatingCompat;
            String str3 = str + " " + str2 + " " + (Integer.valueOf(key2.serializer.intValue() - key5.serializer.intValue()) + "," + Integer.valueOf(key2.RemoteActionCompatParcelizer.intValue() - key5.RemoteActionCompatParcelizer.intValue())) + " ";
            if (!(!"c0 0 0 0 0 0".equals(str3))) {
                int i6 = r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 + 17;
                r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
                str3 = "";
            }
            sb.append(str3);
            transitionValuesMaps2.RatingCompat = key2;
            signaturePad2.serializer();
            Paint paint = signaturePad2.ResultReceiver;
            float strokeWidth = paint.getStrokeWidth();
            int i8 = r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 + 23;
            r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
            double d = 0.0d;
            int i10 = 0;
            double d2 = 0.0d;
            float fSqrt2 = 0.0f;
            while (i10 <= 10) {
                float f4 = i10 / 10.0f;
                float f5 = f2;
                float f6 = strokeWidth;
                double dRemoteActionCompatParcelizer = TransitionValuesMaps.RemoteActionCompatParcelizer(f4, ((setOnEvent) transitionValuesMaps.MediaBrowserCompatMediaItem).IconCompatParcelizer, ((setOnEvent) transitionValuesMaps.MediaDescriptionCompat).IconCompatParcelizer, ((setOnEvent) transitionValuesMaps.MediaMetadataCompat).IconCompatParcelizer, ((setOnEvent) transitionValuesMaps.RatingCompat).IconCompatParcelizer);
                SignaturePad signaturePad3 = signaturePad2;
                Paint paint2 = paint;
                double dRemoteActionCompatParcelizer2 = TransitionValuesMaps.RemoteActionCompatParcelizer(f4, ((setOnEvent) transitionValuesMaps.MediaBrowserCompatMediaItem).serializer, ((setOnEvent) transitionValuesMaps.MediaDescriptionCompat).serializer, ((setOnEvent) transitionValuesMaps.MediaMetadataCompat).serializer, ((setOnEvent) transitionValuesMaps.RatingCompat).serializer);
                if (i10 > 0) {
                    double d3 = dRemoteActionCompatParcelizer - d2;
                    double d4 = dRemoteActionCompatParcelizer2 - d;
                    fSqrt2 = (float) (Math.sqrt((d4 * d4) + (d3 * d3)) + ((double) fSqrt2));
                }
                i10++;
                d = dRemoteActionCompatParcelizer2;
                d2 = dRemoteActionCompatParcelizer;
                f2 = f5;
                strokeWidth = f6;
                signaturePad2 = signaturePad3;
                paint = paint2;
            }
            Paint paint3 = paint;
            SignaturePad signaturePad4 = signaturePad2;
            float f7 = strokeWidth;
            float f8 = f2;
            float fCeil = (float) Math.ceil(fSqrt2);
            int i11 = 0;
            while (true) {
                float f9 = i11;
                if (f9 >= fCeil) {
                    signaturePad = signaturePad4;
                    paint3.setStrokeWidth(f7);
                    signaturePad.PlaybackStateCompat = f8;
                    signaturePad.MediaSessionCompatResultReceiverWrapper = fMax;
                    arrayList.add((setOnEvent) signaturePad.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.remove(0));
                    arrayList.add(setonevent2);
                    arrayList.add(setonevent4);
                    break;
                }
                float f10 = f9 / fCeil;
                float f11 = f10 * f10;
                float f12 = f11 * f10;
                float f13 = 1.0f - f10;
                float f14 = f13 * f13;
                float f15 = f14 * f13;
                setOnEvent setonevent9 = (setOnEvent) transitionValuesMaps.MediaBrowserCompatMediaItem;
                float f16 = setonevent9.IconCompatParcelizer;
                float f17 = f14 * 3.0f * f10;
                setOnEvent setonevent10 = (setOnEvent) transitionValuesMaps.MediaDescriptionCompat;
                float f18 = setonevent10.IconCompatParcelizer;
                float f19 = f13 * 3.0f * f11;
                setOnEvent setonevent11 = (setOnEvent) transitionValuesMaps.MediaMetadataCompat;
                float f20 = setonevent11.IconCompatParcelizer;
                setOnEvent setonevent12 = (setOnEvent) transitionValuesMaps.RatingCompat;
                float f21 = fCeil;
                float f22 = (setonevent12.IconCompatParcelizer * f12) + (f20 * f19) + (f18 * f17) + (f16 * f15);
                float f23 = setonevent9.serializer;
                float f24 = (setonevent12.serializer * f12) + (f19 * setonevent11.serializer) + (f17 * setonevent10.serializer) + (f15 * f23);
                Paint paint4 = paint3;
                paint4.setStrokeWidth((f12 * (fMax - f3)) + f3);
                SignaturePad signaturePad5 = signaturePad4;
                signaturePad5.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM.drawPoint(f22, f24, paint4);
                RectF rectF = signaturePad5.RatingCompat;
                if (f22 < rectF.left) {
                    rectF.left = f22;
                } else if (f22 > rectF.right) {
                    int i12 = r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 + 123;
                    r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = i12 % Fields.SpotShadowColor;
                    if (i12 % 2 != 0) {
                        rectF.right = f22;
                        throw null;
                    }
                    rectF.right = f22;
                }
                if (f24 < rectF.top) {
                    int i13 = r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 + 119;
                    r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = i13 % Fields.SpotShadowColor;
                    int i14 = i13 % 2;
                    rectF.top = f24;
                } else if (f24 > rectF.bottom) {
                    rectF.bottom = f24;
                }
                i11++;
                paint3 = paint4;
                signaturePad4 = signaturePad5;
                fCeil = f21;
            }
        } else {
            signaturePad = signaturePad2;
            if (size == 1) {
                int i15 = r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 + 63;
                r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = i15 % Fields.SpotShadowColor;
                int i16 = i15 % 2;
                setOnEvent setonevent13 = (setOnEvent) signaturePad.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.get(0);
                signaturePad.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.add(signaturePad.read(setonevent13.IconCompatParcelizer, setonevent13.serializer));
            }
        }
        signaturePad.MediaDescriptionCompat = Boolean.TRUE;
        return null;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i = SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read();
        serializer(SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), -1817622454, new Object[]{this, canvas}, i, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), 1817622455);
    }

    public final void write(setOnEvent setonevent) {
        int i = SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read();
        serializer(SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), 1012714337, new Object[]{this, setonevent}, i, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), -1012714337);
    }
}
