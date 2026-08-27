package o;

import android.content.res.Resources;
import android.hardware.biometrics.BiometricManager;
import android.os.Build;
import androidx.camera.video.Recorder$3;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.roadrunner.domain.util.IsFixableByRetry;
import com.roadrunner.domain.util.RetryWithDelay;
import dagger.Lazy;
import io.sentry.android.core.SentryLogcatAdapter;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class setTextSubstitutiondefault {
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;
    public final IsFixableByRetry IconCompatParcelizer;
    public final Lazy read;

    public setTextSubstitutiondefault(Lazy lazy, IsFixableByRetry isFixableByRetry) {
        lazy.getClass();
        isFixableByRetry.getClass();
        this.read = lazy;
        this.IconCompatParcelizer = isFixableByRetry;
    }

    public final setTextSubstitution write() {
        int i = 2 % 2;
        setTextSubstitution settextsubstitution = new setTextSubstitution(serializer(15), serializer(255), serializer(androidx.compose.ui.graphics.Fields.CompositingStrategy));
        int i2 = serializer + 5;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return settextsubstitution;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x004d  */
    /* JADX WARN: Code duplicated, block: B:16:0x0053  */
    /* JADX WARN: Code duplicated, block: B:18:0x005b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x005d  */
    /* JADX WARN: Code duplicated, block: B:21:0x0062  */
    /* JADX WARN: Code duplicated, block: B:23:0x0065  */
    /* JADX WARN: Code duplicated, block: B:25:0x0069  */
    /* JADX WARN: Code duplicated, block: B:27:0x006d  */
    /* JADX WARN: Code duplicated, block: B:28:0x0072  */
    /* JADX WARN: Code duplicated, block: B:30:0x0075  */
    /* JADX WARN: Code duplicated, block: B:32:0x0080  */
    /* JADX WARN: Code duplicated, block: B:33:0x0088  */
    /* JADX WARN: Code duplicated, block: B:34:0x0090  */
    /* JADX WARN: Code duplicated, block: B:35:0x0098  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:59:0x012b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.util.ArrayList] */
    public final setTraversalIndex serializer(int i) {
        ?? arrayList;
        setTextSelectionRangeFDrldGo settextselectionrangefdrldgo;
        CharSequence charSequenceAc_;
        setToggleableState settoggleablestate;
        RetryWithDelay retryWithDelay;
        Resources resources;
        int i2;
        int i3;
        int i4 = 2 % 2;
        Lazy lazy = this.read;
        Object objWrite = lazy.write();
        objWrite.getClass();
        int i5 = ((getPopupBackground) objWrite).read(i);
        Object objWrite2 = lazy.write();
        objWrite2.getClass();
        Recorder$3 recorder$3Serializer = ((getPopupBackground) objWrite2).serializer(i);
        this.IconCompatParcelizer.getClass();
        if (recorder$3Serializer != null) {
            int i6 = RemoteActionCompatParcelizer + 19;
            serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i6 % 2 != 0 ? Build.VERSION.SDK_INT < 31 : Build.VERSION.SDK_INT < 16) {
                retryWithDelay = (RetryWithDelay) recorder$3Serializer.RemoteActionCompatParcelizer;
                if (retryWithDelay != null) {
                    resources = (Resources) retryWithDelay.IconCompatParcelizer;
                    i2 = retryWithDelay.RemoteActionCompatParcelizer;
                    if (i2 != 0) {
                        if (i2 != 1) {
                            charSequenceAc_ = resources.getString(com.logistics.rider.glovo.R.string.use_screen_lock_label);
                        } else if (i2 != 2) {
                            charSequenceAc_ = resources.getString(com.logistics.rider.glovo.R.string.use_biometric_label);
                        } else if (i2 != 4) {
                            charSequenceAc_ = resources.getString(com.logistics.rider.glovo.R.string.use_fingerprint_label);
                        } else if (i2 != 8) {
                            charSequenceAc_ = resources.getString(com.logistics.rider.glovo.R.string.use_face_label);
                        } else if ((i2 & 1) == 0) {
                            charSequenceAc_ = resources.getString(com.logistics.rider.glovo.R.string.use_biometric_label);
                        } else {
                            i3 = i2 & (-2);
                            if (i3 != 4) {
                                int i7 = serializer + 121;
                                RemoteActionCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                int i8 = i7 % 2;
                                if (i3 != 8) {
                                    charSequenceAc_ = resources.getString(com.logistics.rider.glovo.R.string.use_biometric_or_screen_lock_label);
                                } else {
                                    charSequenceAc_ = resources.getString(com.logistics.rider.glovo.R.string.use_face_or_screen_lock_label);
                                }
                            } else {
                                charSequenceAc_ = resources.getString(com.logistics.rider.glovo.R.string.use_fingerprint_or_screen_lock_label);
                            }
                        }
                    }
                } else {
                    SentryLogcatAdapter.serializer("BiometricManager", "Failure in Strings.getSettingName(). No available string provider.");
                }
                charSequenceAc_ = null;
            } else {
                BiometricManager.Strings strings = (BiometricManager.Strings) recorder$3Serializer.MediaBrowserCompatMediaItem;
                if (strings != null) {
                    charSequenceAc_ = setAdapter.ac_(strings);
                } else {
                    retryWithDelay = (RetryWithDelay) recorder$3Serializer.RemoteActionCompatParcelizer;
                    if (retryWithDelay != null) {
                        resources = (Resources) retryWithDelay.IconCompatParcelizer;
                        i2 = retryWithDelay.RemoteActionCompatParcelizer;
                        if (i2 != 0) {
                            if (i2 != 1) {
                                charSequenceAc_ = resources.getString(com.logistics.rider.glovo.R.string.use_screen_lock_label);
                            } else if (i2 != 2) {
                                charSequenceAc_ = resources.getString(com.logistics.rider.glovo.R.string.use_biometric_label);
                            } else if (i2 != 4) {
                                charSequenceAc_ = resources.getString(com.logistics.rider.glovo.R.string.use_fingerprint_label);
                            } else if (i2 != 8) {
                                charSequenceAc_ = resources.getString(com.logistics.rider.glovo.R.string.use_face_label);
                            } else if ((i2 & 1) == 0) {
                                charSequenceAc_ = resources.getString(com.logistics.rider.glovo.R.string.use_biometric_label);
                            } else {
                                i3 = i2 & (-2);
                                if (i3 != 4) {
                                    int i9 = serializer + 121;
                                    RemoteActionCompatParcelizer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                    int i10 = i9 % 2;
                                    if (i3 != 8) {
                                        charSequenceAc_ = resources.getString(com.logistics.rider.glovo.R.string.use_biometric_or_screen_lock_label);
                                    } else {
                                        charSequenceAc_ = resources.getString(com.logistics.rider.glovo.R.string.use_face_or_screen_lock_label);
                                    }
                                } else {
                                    charSequenceAc_ = resources.getString(com.logistics.rider.glovo.R.string.use_fingerprint_or_screen_lock_label);
                                }
                            }
                        }
                    } else {
                        SentryLogcatAdapter.serializer("BiometricManager", "Failure in Strings.getSettingName(). No available string provider.");
                    }
                    charSequenceAc_ = null;
                }
            }
            if (charSequenceAc_ != null) {
                List<String> listSerializer = hideCurrentlyDisplayingInAppMessage.serializer(charSequenceAc_, new String[]{"or"}, 6);
                arrayList = new ArrayList(accessgetInstancedelegatecp.write(listSerializer, 10));
                for (String str : listSerializer) {
                    if (hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer((CharSequence) str, (CharSequence) "biometrics", false)) {
                        settoggleablestate = setToggleableState.BIOMETRICS;
                    } else if (hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer((CharSequence) str, (CharSequence) HiAnalyticsConstant.HaKey.BI_KEY_FINGERPRINT, false)) {
                        int i11 = RemoteActionCompatParcelizer + 17;
                        serializer = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i12 = i11 % 2;
                        settoggleablestate = setToggleableState.FINGERPRINT;
                    } else if (hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer((CharSequence) str, (CharSequence) "face", false)) {
                        settoggleablestate = setToggleableState.FACE;
                    } else if (hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer((CharSequence) str, (CharSequence) "screen lock", false)) {
                        int i13 = RemoteActionCompatParcelizer + 113;
                        serializer = i13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i14 = i13 % 2;
                        settoggleablestate = setToggleableState.CREDENTIAL;
                    } else {
                        settoggleablestate = setToggleableState.BIOMETRICS;
                    }
                    arrayList.add(settoggleablestate);
                }
            } else {
                Object[] objArr = {setToggleableState.NONE};
                int iSerializer = getQueryParameterslambda2.serializer();
                arrayList = (List) androidx.sqlite.SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, objArr, getQueryParameterslambda2.serializer(), -516583649, iSerializer);
            }
        } else {
            Object[] objArr2 = {setToggleableState.NONE};
            int iSerializer2 = getQueryParameterslambda2.serializer();
            arrayList = (List) androidx.sqlite.SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, objArr2, getQueryParameterslambda2.serializer(), -516583649, iSerializer2);
        }
        if (i5 == -2 || i5 == 1 || i5 == 12 || i5 == 15) {
            settextselectionrangefdrldgo = setTextSelectionRangeFDrldGo.NOT_SUPPORTED;
        } else if (i5 == 0) {
            settextselectionrangefdrldgo = setTextSelectionRangeFDrldGo.AVAILABLE;
        } else if (i5 == 11) {
            int i15 = serializer + 49;
            RemoteActionCompatParcelizer = i15 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i15 % 2 != 0) {
                settextselectionrangefdrldgo = setTextSelectionRangeFDrldGo.NOT_ENROLLED;
                int i16 = 25 / 0;
            } else {
                settextselectionrangefdrldgo = setTextSelectionRangeFDrldGo.NOT_ENROLLED;
            }
        } else {
            settextselectionrangefdrldgo = setTextSelectionRangeFDrldGo.NOT_SUPPORTED;
        }
        return new setTraversalIndex(settextselectionrangefdrldgo, arrayList);
    }
}
