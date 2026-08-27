package o;

import android.util.Log;
import io.sentry.CombinedScopeView;
import io.sentry.android.core.SentryLogcatAdapter;

/* JADX INFO: loaded from: classes3.dex */
public final class addListener extends ProtoPrerequisiteMsggetAsPrerequisite1 {
    private static int IconCompatParcelizer = 1;
    private static int serializer;
    public final /* synthetic */ CombinedScopeView RemoteActionCompatParcelizer;

    public addListener(CombinedScopeView combinedScopeView) {
        this.RemoteActionCompatParcelizer = combinedScopeView;
    }

    @Override // o.ProtoPrerequisiteMsgserializer
    public final void IconCompatParcelizer(int i, String str, String str2, Throwable th) {
        int iMin;
        int i2 = 2 % 2;
        str2.getClass();
        if (str2.length() >= 4000) {
            int length = str2.length();
            int i3 = 0;
            while (i3 < length) {
                int iWrite = hideCurrentlyDisplayingInAppMessage.write((CharSequence) str2, '\n', i3, false, 4);
                if (iWrite == -1) {
                    iWrite = length;
                }
                while (true) {
                    iMin = Math.min(iWrite, i3 + 4000);
                    String strSubstring = str2.substring(i3, iMin);
                    if (i == 7) {
                        int i4 = IconCompatParcelizer + 17;
                        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i5 = i4 % 2;
                        SentryLogcatAdapter.read(str, r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, strSubstring, null);
                        SentryLogcatAdapter.serializer(logClicklambda0.FATAL, strSubstring, null);
                        Log.wtf(str, strSubstring);
                    } else {
                        Log.println(i, str, strSubstring);
                        int i6 = serializer + 15;
                        IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i7 = i6 % 2;
                    }
                    if (iMin >= iWrite) {
                        break;
                    } else {
                        i3 = iMin;
                    }
                }
                i3 = iMin + 1;
                int i8 = IconCompatParcelizer + 101;
                serializer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i9 = i8 % 2;
            }
        } else if (i == 7) {
            int i10 = IconCompatParcelizer + 15;
            serializer = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i11 = i10 % 2;
            SentryLogcatAdapter.read(str, r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, str2, null);
            SentryLogcatAdapter.serializer(logClicklambda0.FATAL, str2, null);
            Log.wtf(str, str2);
        } else {
            Log.println(i, str, str2);
        }
        if (i == 7) {
            int i12 = IconCompatParcelizer + 115;
            serializer = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i13 = i12 % 2;
            Object obj = this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer;
        }
    }
}
