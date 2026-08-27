package o;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;

/* JADX INFO: loaded from: classes.dex */
public final class CompositionLocalMapInjectionElement {
    public static final CompositionLocalMapInjectionElement RemoteActionCompatParcelizer = new CompositionLocalMapInjectionElement();

    public final void write(final Icon icon, getBirthDateFull getbirthdatefull, final int i) {
        int i2;
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat;
        r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(2116504409);
        if ((i & 6) == 0) {
            i2 = (getpostalcode.IconCompatParcelizer(icon) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode.read(this) ? 32 : 16;
        }
        final int i3 = 0;
        final int i4 = 1;
        if (getpostalcode.write(i2 & 1, (i2 & 19) != 18)) {
            Context context = (Context) getpostalcode.write((getNewPassword) androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
            boolean z = getpostalcode.read(icon);
            boolean z2 = getpostalcode.read(context);
            Object objComponentActivity = getpostalcode.ComponentActivity();
            if ((z | z2) || objComponentActivity == getCreditCardExpirationMonth.write) {
                objComponentActivity = icon.loadDrawable(context);
                getpostalcode.write(objComponentActivity);
            }
            Drawable drawable = (Drawable) objComponentActivity;
            if (drawable == null) {
                gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
                if (gethandleruiannotationsMediaDescriptionCompat == null) {
                    return;
                } else {
                    r8lambdaa6_tctqmksh3fk6hjgcbkuvde0 = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0(this) { // from class: o.ComposedModifierKtmaterializeImplresult1
                        public final /* synthetic */ CompositionLocalMapInjectionElement RemoteActionCompatParcelizer;

                        {
                            this.RemoteActionCompatParcelizer = this;
                        }

                        @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                        public final Object invoke(Object obj, Object obj2) {
                            int i5 = i3;
                            createFromParcel createfromparcel = createFromParcel.INSTANCE;
                            int i6 = i;
                            Icon icon2 = icon;
                            CompositionLocalMapInjectionElement compositionLocalMapInjectionElement = this.RemoteActionCompatParcelizer;
                            getBirthDateFull getbirthdatefull2 = (getBirthDateFull) obj;
                            ((Integer) obj2).getClass();
                            if (i5 != 0) {
                                compositionLocalMapInjectionElement.write(icon2, getbirthdatefull2, ContentType_androidKt.RemoteActionCompatParcelizer(i6 | 1));
                                return createfromparcel;
                            }
                            compositionLocalMapInjectionElement.write(icon2, getbirthdatefull2, ContentType_androidKt.RemoteActionCompatParcelizer(i6 | 1));
                            return createfromparcel;
                        }
                    };
                }
            } else {
                read(drawable, getpostalcode, i2 & 112);
            }
            gethandleruiannotationsMediaDescriptionCompat.serializer = r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
        }
        getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            r8lambdaa6_tctqmksh3fk6hjgcbkuvde0 = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0(this) { // from class: o.ComposedModifierKtmaterializeImplresult1
                public final /* synthetic */ CompositionLocalMapInjectionElement RemoteActionCompatParcelizer;

                {
                    this.RemoteActionCompatParcelizer = this;
                }

                @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                public final Object invoke(Object obj, Object obj2) {
                    int i5 = i4;
                    createFromParcel createfromparcel = createFromParcel.INSTANCE;
                    int i6 = i;
                    Icon icon2 = icon;
                    CompositionLocalMapInjectionElement compositionLocalMapInjectionElement = this.RemoteActionCompatParcelizer;
                    getBirthDateFull getbirthdatefull2 = (getBirthDateFull) obj;
                    ((Integer) obj2).getClass();
                    if (i5 != 0) {
                        compositionLocalMapInjectionElement.write(icon2, getbirthdatefull2, ContentType_androidKt.RemoteActionCompatParcelizer(i6 | 1));
                        return createfromparcel;
                    }
                    compositionLocalMapInjectionElement.write(icon2, getbirthdatefull2, ContentType_androidKt.RemoteActionCompatParcelizer(i6 | 1));
                    return createfromparcel;
                }
            };
            gethandleruiannotationsMediaDescriptionCompat.serializer = r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
        }
    }

    public final void read(Drawable drawable, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(257732500);
        if ((i & 6) == 0) {
            i2 = (getpostalcode.IconCompatParcelizer(drawable) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (getpostalcode.write(i2 & 1, (i2 & 3) != 2)) {
            androidx.compose.ui.Modifier modifierM83size3ABfNKs = androidx.compose.foundation.layout.SizeKt.m83size3ABfNKs(androidx.compose.ui.Modifier.Companion, androidx.compose.foundation.contextmenu.ContextMenuSpec.MediaSessionCompatQueueItem);
            boolean zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(drawable);
            Object objComponentActivity = getpostalcode.ComponentActivity();
            if (zIconCompatParcelizer || objComponentActivity == getCreditCardExpirationMonth.write) {
                objComponentActivity = new InlineChildren(15, drawable);
                getpostalcode.write(objComponentActivity);
            }
            androidx.compose.foundation.layout.BoxKt.Box(androidx.compose.ui.draw.DrawModifierKt.drawBehind(modifierM83size3ABfNKs, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity), getpostalcode, 0);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new AndroidPrefetchScheduler(i, 4, this, drawable);
        }
    }
}
