package org.tukaani.xz.delta;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import android.util.Base64;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.compose.ui.graphics.Fields;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.firestore.v1.BloomFilter;
import com.mapbox.maps.plugin.attribution.AttributionDialogManagerImpl$$ExternalSyntheticLambda0;
import com.mapbox.navigation.base.formatter.TimeFormatter;
import com.mapbox.navigation.base.speed.model.SpeedUnit;
import java.io.ByteArrayOutputStream;
import java.nio.charset.StandardCharsets;
import java.util.Date;
import o.AppCompatActivity;
import o.debugInspectorInfo;
import o.drawArcyD3GUKodefault;
import o.drawOvalnJ9OG0default;
import o.generateOetf;
import o.getA;
import o.getEotfFuncui_graphics;
import o.onRetainCustomNonConfigurationInstance;
import o.onSaveInstanceState;
import o.peekAvailableContext;
import o.registerForActivityResult;
import o.removeOnConfigurationChangedListener;
import o.removeOnContextAvailableListener;

/* JADX INFO: loaded from: classes4.dex */
public final class DeltaDecoder implements drawOvalnJ9OG0default, TimeFormatter {
    private static int RatingCompat = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static byte read = -112;
    public final /* synthetic */ int IconCompatParcelizer;
    public Object serializer;
    public int write;

    public int getCurrentSpeed() {
        return this.write;
    }

    public int write() {
        return this.write;
    }

    public void IconCompatParcelizer() {
        ((onRetainCustomNonConfigurationInstance) this.serializer).serializer = false;
    }

    public Date RemoteActionCompatParcelizer() {
        return (Date) this.serializer;
    }

    @Override // o.drawOvalnJ9OG0default
    public generateOetf RemoteActionCompatParcelizer(generateOetf generateoetf, getEotfFuncui_graphics geteotffuncui_graphics) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ((Bitmap) generateoetf.IconCompatParcelizer()).compress((Bitmap.CompressFormat) this.serializer, this.write, byteArrayOutputStream);
        generateoetf.MediaBrowserCompatMediaItem();
        return new drawArcyD3GUKodefault(byteArrayOutputStream.toByteArray());
    }

    public Integer getPostedSpeed() {
        return (Integer) this.serializer;
    }

    public boolean read() {
        return ((getA) this.serializer) != null;
    }

    public int serializer(int i) {
        CharSequence charSequence = (CharSequence) this.serializer;
        return debugInspectorInfo.write((i <= 0 || i > charSequence.length()) ? -1 : Character.codePointBefore(charSequence, i), i < charSequence.length() ? Character.codePointAt(charSequence, i) : -1);
    }

    public removeOnContextAvailableListener serializer() {
        onRetainCustomNonConfigurationInstance onretaincustomnonconfigurationinstance = (onRetainCustomNonConfigurationInstance) this.serializer;
        removeOnContextAvailableListener removeoncontextavailablelistener = new removeOnContextAvailableListener(onretaincustomnonconfigurationinstance.write, this.write);
        View view = onretaincustomnonconfigurationinstance.RemoteActionCompatParcelizer;
        onSaveInstanceState onsaveinstancestate = removeoncontextavailablelistener.write;
        if (view != null) {
            onsaveinstancestate.MediaSessionCompatResultReceiverWrapper = view;
        } else {
            CharSequence charSequence = onretaincustomnonconfigurationinstance.ResultReceiver;
            if (charSequence != null) {
                onsaveinstancestate.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = charSequence;
                TextView textView = onsaveinstancestate.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = onretaincustomnonconfigurationinstance.MediaMetadataCompat;
            if (drawable != null) {
                onsaveinstancestate.ResultReceiver = drawable;
                ImageView imageView = onsaveinstancestate.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    onsaveinstancestate.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.setImageDrawable(drawable);
                }
            }
        }
        CharSequence charSequence2 = onretaincustomnonconfigurationinstance.RatingCompat;
        if (charSequence2 != null) {
            onsaveinstancestate.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = charSequence2;
            TextView textView2 = onsaveinstancestate.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
            if (textView2 != null) {
                textView2.setText(charSequence2);
            }
        }
        CharSequence charSequence3 = onretaincustomnonconfigurationinstance.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        if (charSequence3 != null) {
            onsaveinstancestate.IconCompatParcelizer(-1, charSequence3, onretaincustomnonconfigurationinstance.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY);
        }
        CharSequence charSequence4 = onretaincustomnonconfigurationinstance.ParcelableVolumeInfo;
        if (charSequence4 != null) {
            onsaveinstancestate.IconCompatParcelizer(-2, charSequence4, onretaincustomnonconfigurationinstance.MediaSessionCompatQueueItem);
        }
        CharSequence charSequence5 = onretaincustomnonconfigurationinstance.PlaybackStateCompat;
        if (charSequence5 != null) {
            onsaveinstancestate.IconCompatParcelizer(-3, charSequence5, onretaincustomnonconfigurationinstance.MediaSessionCompatToken);
        }
        if (onretaincustomnonconfigurationinstance.read != null) {
            peekAvailableContext peekavailablecontext = (peekAvailableContext) onretaincustomnonconfigurationinstance.MediaDescriptionCompat.inflate(onsaveinstancestate.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss, (ViewGroup) null);
            int i = onretaincustomnonconfigurationinstance.MediaBrowserCompatMediaItem ? onsaveinstancestate.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw : onsaveinstancestate.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
            ListAdapter registerforactivityresult = onretaincustomnonconfigurationinstance.read;
            if (registerforactivityresult == null) {
                registerforactivityresult = new registerForActivityResult(onretaincustomnonconfigurationinstance.write, i, R.id.text1, null);
            }
            onsaveinstancestate.read = registerforactivityresult;
            onsaveinstancestate.ParcelableVolumeInfo = onretaincustomnonconfigurationinstance.IconCompatParcelizer;
            if (onretaincustomnonconfigurationinstance.PlaybackStateCompatCustomAction != null) {
                peekavailablecontext.setOnItemClickListener(new removeOnConfigurationChangedListener(onretaincustomnonconfigurationinstance, onsaveinstancestate));
            }
            if (onretaincustomnonconfigurationinstance.MediaBrowserCompatMediaItem) {
                peekavailablecontext.setChoiceMode(1);
            }
            onsaveinstancestate.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = peekavailablecontext;
        }
        removeoncontextavailablelistener.setCancelable(onretaincustomnonconfigurationinstance.serializer);
        if (onretaincustomnonconfigurationinstance.serializer) {
            removeoncontextavailablelistener.setCanceledOnTouchOutside(true);
        }
        removeoncontextavailablelistener.setOnCancelListener(null);
        removeoncontextavailablelistener.setOnDismissListener(null);
        AppCompatActivity appCompatActivity = onretaincustomnonconfigurationinstance.MediaSessionCompatResultReceiverWrapper;
        if (appCompatActivity != null) {
            removeoncontextavailablelistener.setOnKeyListener(appCompatActivity);
        }
        return removeoncontextavailablelistener;
    }

    public void serializer(BaseAdapter baseAdapter, DialogInterface.OnClickListener onClickListener) {
        onRetainCustomNonConfigurationInstance onretaincustomnonconfigurationinstance = (onRetainCustomNonConfigurationInstance) this.serializer;
        onretaincustomnonconfigurationinstance.read = baseAdapter;
        onretaincustomnonconfigurationinstance.PlaybackStateCompatCustomAction = onClickListener;
    }

    public void write(AttributionDialogManagerImpl$$ExternalSyntheticLambda0 attributionDialogManagerImpl$$ExternalSyntheticLambda0) {
        onRetainCustomNonConfigurationInstance onretaincustomnonconfigurationinstance = (onRetainCustomNonConfigurationInstance) this.serializer;
        onretaincustomnonconfigurationinstance.PlaybackStateCompat = onretaincustomnonconfigurationinstance.write.getText(com.logistics.rider.glovo.R.string.mapbox_attributionTelemetryNeutral);
        onretaincustomnonconfigurationinstance.MediaSessionCompatToken = attributionDialogManagerImpl$$ExternalSyntheticLambda0;
    }

    public removeOnContextAvailableListener MediaMetadataCompat() {
        removeOnContextAvailableListener removeoncontextavailablelistenerSerializer = serializer();
        removeoncontextavailablelistenerSerializer.show();
        return removeoncontextavailablelistenerSerializer;
    }

    public int RemoteActionCompatParcelizer(int i) {
        if (i >= this.write) {
            return -8;
        }
        int iCodePointAt = Character.codePointAt((CharSequence) this.serializer, i);
        return (iCodePointAt << 3) | Character.charCount(iCodePointAt);
    }

    public DeltaDecoder(byte b, int i) {
        this.IconCompatParcelizer = i;
        if (i != 5) {
            this.write = 255;
            this.serializer = null;
        } else {
            this.serializer = Bitmap.CompressFormat.JPEG;
            this.write = 100;
        }
    }

    public String toString() {
        if (this.IconCompatParcelizer != 7) {
            return super.toString();
        }
        return "ExistenceFilter{count=" + this.write + ", unchangedNames=" + ((BloomFilter) this.serializer) + '}';
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0059 A[PHI: r3 r11
  0x0059: PHI (r3v6 java.lang.String) = (r3v12 java.lang.String), (r3v13 java.lang.String) binds: [B:10:0x0057, B:7:0x003d] A[DONT_GENERATE, DONT_INLINE]
  0x0059: PHI (r11v6 java.lang.CharSequence) = (r11v5 java.lang.CharSequence), (r11v9 java.lang.CharSequence) binds: [B:10:0x0057, B:7:0x003d] A[DONT_GENERATE, DONT_INLINE]] */
    public void IconCompatParcelizer(int i) {
        String strIntern;
        CharSequence text;
        String str;
        String strIntern2;
        int i2 = 2 % 2;
        onRetainCustomNonConfigurationInstance onretaincustomnonconfigurationinstance = (onRetainCustomNonConfigurationInstance) this.serializer;
        ContextThemeWrapper contextThemeWrapper = onretaincustomnonconfigurationinstance.write;
        String string = contextThemeWrapper.getString(i);
        boolean zStartsWith = string.startsWith("%('");
        CharSequence charSequence = string;
        if (zStartsWith) {
            int i3 = RatingCompat + 41;
            RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                Object[] objArr = new Object[1];
                a(string.substring(3), objArr);
                strIntern2 = ((String) objArr[0]).intern();
                text = contextThemeWrapper.getText(i);
                int i4 = 37 / 0;
                if (text instanceof Spanned) {
                    str = strIntern;
                    charSequence = strIntern;
                    str = strIntern2;
                    charSequence = strIntern2;
                    SpannableString spannableString = new SpannableString(str);
                    TextUtils.copySpansFrom((SpannedString) text, 0, str.length(), Object.class, spannableString, 0);
                    charSequence = spannableString;
                }
            } else {
                Object[] objArr2 = new Object[1];
                a(string.substring(3), objArr2);
                strIntern = ((String) objArr2[0]).intern();
                text = contextThemeWrapper.getText(i);
                if (text instanceof Spanned) {
                    str = strIntern;
                    charSequence = strIntern;
                    str = strIntern2;
                    charSequence = strIntern2;
                    SpannableString spannableString2 = new SpannableString(str);
                    TextUtils.copySpansFrom((SpannedString) text, 0, str.length(), Object.class, spannableString2, 0);
                    charSequence = spannableString2;
                }
            }
        }
        str = strIntern;
        charSequence = strIntern;
        str = strIntern2;
        charSequence = strIntern2;
        onretaincustomnonconfigurationinstance.ResultReceiver = charSequence;
        int i5 = RatingCompat + 31;
        RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0062 A[PHI: r3 r11
  0x0062: PHI (r3v6 java.lang.String) = (r3v15 java.lang.String), (r3v16 java.lang.String) binds: [B:10:0x0060, B:7:0x0046] A[DONT_GENERATE, DONT_INLINE]
  0x0062: PHI (r11v2 java.lang.CharSequence) = (r11v1 java.lang.CharSequence), (r11v8 java.lang.CharSequence) binds: [B:10:0x0060, B:7:0x0046] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:12:0x007b A[PHI: r3
  0x007b: PHI (r3v8 java.lang.String) = (r3v13 java.lang.String), (r3v14 java.lang.String) binds: [B:10:0x0060, B:7:0x0046] A[DONT_GENERATE, DONT_INLINE]] */
    public void write(int i) {
        String strIntern;
        CharSequence text;
        String str;
        String str2;
        String strIntern2;
        int i2 = 2 % 2;
        int i3 = RatingCompat + 87;
        RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        onRetainCustomNonConfigurationInstance onretaincustomnonconfigurationinstance = (onRetainCustomNonConfigurationInstance) this.serializer;
        ContextThemeWrapper contextThemeWrapper = onretaincustomnonconfigurationinstance.write;
        String string = contextThemeWrapper.getString(i);
        boolean zStartsWith = string.startsWith("%('");
        CharSequence charSequence = string;
        if (zStartsWith) {
            int i5 = RemoteActionCompatParcelizer + 33;
            RatingCompat = i5 % Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                Object[] objArr = new Object[1];
                a(string.substring(3), objArr);
                strIntern2 = ((String) objArr[0]).intern();
                text = contextThemeWrapper.getText(i);
                int i6 = 73 / 0;
                if (text instanceof Spanned) {
                    str2 = strIntern;
                    str = strIntern;
                    str2 = strIntern2;
                    str = strIntern2;
                    SpannableString spannableString = new SpannableString(str);
                    TextUtils.copySpansFrom((SpannedString) text, 0, str.length(), Object.class, spannableString, 0);
                    charSequence = spannableString;
                } else {
                    str2 = strIntern;
                    str = strIntern;
                    str2 = strIntern2;
                    str = strIntern2;
                    int i7 = RatingCompat + 101;
                    RemoteActionCompatParcelizer = i7 % Fields.SpotShadowColor;
                    int i8 = i7 % 2;
                    charSequence = str2;
                }
            } else {
                Object[] objArr2 = new Object[1];
                a(string.substring(3), objArr2);
                strIntern = ((String) objArr2[0]).intern();
                text = contextThemeWrapper.getText(i);
                if (text instanceof Spanned) {
                    str2 = strIntern;
                    str = strIntern;
                    str2 = strIntern2;
                    str = strIntern2;
                    SpannableString spannableString2 = new SpannableString(str);
                    TextUtils.copySpansFrom((SpannedString) text, 0, str.length(), Object.class, spannableString2, 0);
                    charSequence = spannableString2;
                } else {
                    str2 = strIntern;
                    str = strIntern;
                    str2 = strIntern2;
                    str = strIntern2;
                    int i9 = RatingCompat + 101;
                    RemoteActionCompatParcelizer = i9 % Fields.SpotShadowColor;
                    int i10 = i9 % 2;
                    charSequence = str2;
                }
            }
        }
        onretaincustomnonconfigurationinstance.RatingCompat = charSequence;
    }

    public void RemoteActionCompatParcelizer(String str) {
        ((onRetainCustomNonConfigurationInstance) this.serializer).RatingCompat = str;
    }

    public void write(String str) {
        ((onRetainCustomNonConfigurationInstance) this.serializer).ResultReceiver = str;
    }

    public void read(int i, DialogInterface.OnClickListener onClickListener) {
        CharSequence charSequence;
        int i2 = 2 % 2;
        int i3 = RemoteActionCompatParcelizer + 3;
        RatingCompat = i3 % Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            ((onRetainCustomNonConfigurationInstance) this.serializer).write.getString(i).startsWith("%('");
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        onRetainCustomNonConfigurationInstance onretaincustomnonconfigurationinstance = (onRetainCustomNonConfigurationInstance) this.serializer;
        ContextThemeWrapper contextThemeWrapper = onretaincustomnonconfigurationinstance.write;
        String string = contextThemeWrapper.getString(i);
        if (string.startsWith("%('")) {
            Object[] objArr = new Object[1];
            a(string.substring(3), objArr);
            String strIntern = ((String) objArr[0]).intern();
            CharSequence text = contextThemeWrapper.getText(i);
            if (text instanceof Spanned) {
                charSequence = string;
                SpannableString spannableString = new SpannableString(strIntern);
                TextUtils.copySpansFrom((SpannedString) text, 0, strIntern.length(), Object.class, spannableString, 0);
                charSequence = spannableString;
            } else {
                charSequence = string;
                int i4 = RatingCompat + 99;
                RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                charSequence = strIntern;
            }
        }
        charSequence = string;
        onretaincustomnonconfigurationinstance.ParcelableVolumeInfo = charSequence;
        onretaincustomnonconfigurationinstance.MediaSessionCompatQueueItem = onClickListener;
    }

    public void serializer(int i, DialogInterface.OnClickListener onClickListener) {
        int i2 = 2 % 2;
        onRetainCustomNonConfigurationInstance onretaincustomnonconfigurationinstance = (onRetainCustomNonConfigurationInstance) this.serializer;
        ContextThemeWrapper contextThemeWrapper = onretaincustomnonconfigurationinstance.write;
        String string = contextThemeWrapper.getString(i);
        boolean zStartsWith = string.startsWith("%('");
        CharSequence charSequence = string;
        if (zStartsWith) {
            int i3 = RatingCompat + 103;
            RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                Object[] objArr = new Object[1];
                a(string.substring(3), objArr);
                ((String) objArr[0]).intern();
                boolean z = contextThemeWrapper.getText(i) instanceof Spanned;
                throw null;
            }
            Object[] objArr2 = new Object[1];
            a(string.substring(3), objArr2);
            String strIntern = ((String) objArr2[0]).intern();
            CharSequence text = contextThemeWrapper.getText(i);
            if (text instanceof Spanned) {
                SpannableString spannableString = new SpannableString(strIntern);
                TextUtils.copySpansFrom((SpannedString) text, 0, strIntern.length(), Object.class, spannableString, 0);
                charSequence = spannableString;
            } else {
                int i4 = RatingCompat + 41;
                RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                charSequence = strIntern;
            }
        }
        onretaincustomnonconfigurationinstance.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = charSequence;
        onretaincustomnonconfigurationinstance.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = onClickListener;
    }

    public void IconCompatParcelizer(String str, DialogInterface.OnClickListener onClickListener) {
        onRetainCustomNonConfigurationInstance onretaincustomnonconfigurationinstance = (onRetainCustomNonConfigurationInstance) this.serializer;
        onretaincustomnonconfigurationinstance.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = str;
        onretaincustomnonconfigurationinstance.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = onClickListener;
    }

    public void write(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        onRetainCustomNonConfigurationInstance onretaincustomnonconfigurationinstance = (onRetainCustomNonConfigurationInstance) this.serializer;
        onretaincustomnonconfigurationinstance.ParcelableVolumeInfo = charSequence;
        onretaincustomnonconfigurationinstance.MediaSessionCompatQueueItem = onClickListener;
    }

    public /* synthetic */ DeltaDecoder(int i, Object obj, int i2) {
        this.IconCompatParcelizer = i2;
        this.write = i;
        this.serializer = obj;
    }

    public DeltaDecoder(Context context, int i) {
        this.IconCompatParcelizer = 11;
        context.getClass();
        this.serializer = context;
        this.write = i;
    }

    private void a(String str, Object[] objArr) {
        byte[] bArrDecode = Base64.decode(str, 0);
        byte[] bArr = new byte[bArrDecode.length];
        for (int i = 0; i < bArrDecode.length; i++) {
            bArr[i] = (byte) (bArrDecode[(bArrDecode.length - i) - 1] ^ read);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }

    public DeltaDecoder(Integer num, int i, SpeedUnit speedUnit) {
        this.IconCompatParcelizer = 12;
        this.serializer = num;
        this.write = i;
    }

    public DeltaDecoder(int i) {
        this.IconCompatParcelizer = 0;
        if (i >= 1 && i <= 256) {
            this.write = i;
            this.serializer = new byte[i];
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(c8$$ExternalSyntheticOutline0.m(i, "Invalid distance: "));
            throw null;
        }
    }

    public DeltaDecoder(int i, CharSequence charSequence) {
        this.IconCompatParcelizer = 9;
        this.serializer = charSequence;
        this.write = i;
    }

    public DeltaDecoder(Context context) {
        this.IconCompatParcelizer = 1;
        int i = removeOnContextAvailableListener.read(context, 0);
        this.serializer = new onRetainCustomNonConfigurationInstance(new ContextThemeWrapper(context, removeOnContextAvailableListener.read(context, i)));
        this.write = i;
    }
}
