package androidx.compose.foundation.text;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpSize;
import bo.app.k7$$ExternalSyntheticLambda2;
import coil3.ExtrasKt;
import o.InlineChildren;
import o.SingleThreadFutureScheduler2;
import o.accessthenjd;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getPostalCode;
import o.handleUrlOverridelambda1;
import o.markState;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.runDetachLifecycleui;
import o.setChildui;
import o.setClickable;

/* JADX INFO: loaded from: classes.dex */
public abstract class AndroidCursorHandle_androidKt {
    public static final float RemoteActionCompatParcelizer;
    public static final float write;

    static {
        float fM3673constructorimpl = Dp.m3673constructorimpl(25.0f);
        write = fM3673constructorimpl;
        RemoteActionCompatParcelizer = Dp.m3673constructorimpl(Dp.m3673constructorimpl(fM3673constructorimpl * 2.0f) / 2.4142137f);
    }

    public static final void read(Modifier modifier, getBirthDateFull getbirthdatefull, int i, int i2) {
        int i3;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(694251107);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (getpostalcode.read(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if (getpostalcode.write(i3 & 1, (i3 & 3) != 2)) {
            if (i4 != 0) {
                modifier = Modifier.Companion;
            }
            Object[] objArr = {getpostalcode, DrawModifierKt.drawWithCache(SizeKt.m84sizeVpY3zN4(modifier, RemoteActionCompatParcelizer, write), new k7$$ExternalSyntheticLambda2(((setChildui) getpostalcode.write((getNewPassword) runDetachLifecycleui.read)).read, 1))};
            ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), objArr);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new SingleThreadFutureScheduler2(modifier, i, i2);
        }
    }

    public static final void write(accessthenjd accessthenjdVar, Modifier modifier, long j, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(1776202187);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? getpostalcode.read(accessthenjdVar) : getpostalcode.IconCompatParcelizer(accessthenjdVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode.read(modifier) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= Fields.SpotShadowColor;
        }
        if (getpostalcode.write(i2 & 1, (i2 & 147) != 146)) {
            getpostalcode.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss();
            if ((i & 1) == 0 || getpostalcode.PlaybackStateCompat()) {
                j = DpSize.Companion.m3780getUnspecifiedMYxV2XQ();
            } else {
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            }
            getpostalcode.RemoteActionCompatParcelizer();
            int i3 = i2 & 14;
            boolean z = i3 == 4 || ((i2 & 8) != 0 && getpostalcode.IconCompatParcelizer(accessthenjdVar));
            Object objComponentActivity = getpostalcode.ComponentActivity();
            if (z || objComponentActivity == getCreditCardExpirationMonth.write) {
                objComponentActivity = new InlineChildren(13, accessthenjdVar);
                getpostalcode.write(objComponentActivity);
            }
            AndroidSelectionHandles_androidKt.HandlePopup(accessthenjdVar, Alignment.Companion.getTopCenter(), ExtrasKt.write(-1653527038, new markState(j, SemanticsModifierKt.semantics$default(modifier, false, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity, 1, null)), getpostalcode), getpostalcode, i3 | 432);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        long j2 = j;
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new setClickable(accessthenjdVar, modifier, j2, i);
        }
    }
}
