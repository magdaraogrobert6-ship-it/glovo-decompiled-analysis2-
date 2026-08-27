package o;

import android.os.Bundle;
import com.huawei.location.ut;
import com.roadrunner.web.presentation.simpleWebView.SimpleWebViewFragment;

/* JADX INFO: loaded from: classes2.dex */
public abstract class getRequestDisallowInterceptTouchEvent {
    private static int IconCompatParcelizer = 0;
    private static int serializer = 1;

    public static final accessfoldInjd read(accessfoldInjd accessfoldinjd, accessanyjd accessanyjdVar, int i) {
        int i2 = 2 % 2;
        accessfoldInjd accessfoldinjd2 = new accessfoldInjd(accessanyjdVar.serializer.getBidiRunDirection(i), i, accessfoldinjd.IconCompatParcelizer);
        int i3 = IconCompatParcelizer + 49;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return accessfoldinjd2;
    }

    public static final accessalljd RemoteActionCompatParcelizer(ut utVar, getNodeannotations getnodeannotations) {
        boolean z;
        int i = 2 % 2;
        getLocalUiMediaScope getlocaluimediascopePlaybackStateCompatCustomAction = utVar.PlaybackStateCompatCustomAction();
        accessanyjd accessanyjdVar = (accessanyjd) utVar.MediaBrowserCompatMediaItem;
        if (getlocaluimediascopePlaybackStateCompatCustomAction == getLocalUiMediaScope.CROSSED) {
            int i2 = serializer + 87;
            IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                z = true;
            }
            return new accessalljd(serializer(accessanyjdVar, z, true, getnodeannotations), serializer(accessanyjdVar, z, false, getnodeannotations), z);
        }
        int i3 = IconCompatParcelizer + 123;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        z = false;
        return new accessalljd(serializer(accessanyjdVar, z, true, getnodeannotations), serializer(accessanyjdVar, z, false, getnodeannotations), z);
    }

    public static SimpleWebViewFragment read(String str, String str2, r8lambdaGcPCuHbeI3f7gmV4PjjFd18oWYs r8lambdagcpcuhbei3f7gmv4pjjfd18owys) {
        int i = 2 % 2;
        str.getClass();
        str2.getClass();
        SimpleWebViewFragment simpleWebViewFragment = new SimpleWebViewFragment();
        onViewAttachedToWindowlambda0[] onviewattachedtowindowlambda0Arr = {new onViewAttachedToWindowlambda0("url", str), new onViewAttachedToWindowlambda0(com.deliveryhero.chatsdk.util.PushNotificationParserObj.TITLE_KEY, str2), new onViewAttachedToWindowlambda0("analytics_name", null), new onViewAttachedToWindowlambda0("back_nav", r8lambdagcpcuhbei3f7gmv4pjjfd18owys.name())};
        int iSerializer = isAppSetIdReadingEnabled.serializer();
        simpleWebViewFragment.setArguments((Bundle) setNativeShader.read(-1771348314, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[]{onviewattachedtowindowlambda0Arr}, iSerializer, isAppSetIdReadingEnabled.serializer(), 1771348320));
        int i2 = serializer + 121;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            int i3 = 59 / 0;
        }
        return simpleWebViewFragment;
    }

    public static final accessfoldInjd serializer(accessanyjd accessanyjdVar, boolean z, boolean z2, getNodeannotations getnodeannotations) {
        long jTextRange;
        int i;
        int iM3076getStartimpl;
        int i2 = 2 % 2;
        int i3 = z2 ^ true ? accessanyjdVar.IconCompatParcelizer : accessanyjdVar.read;
        if (getnodeannotations.MediaDescriptionCompat != 1) {
            jTextRange = accessanyjdVar.serializer.m3048getWordBoundaryjx7JFs(i3);
            i = IconCompatParcelizer + 103;
        } else {
            String text = accessanyjdVar.serializer.getLayoutInput().getText().getText();
            jTextRange = androidx.compose.ui.text.TextRangeKt.TextRange(getCenterStart.serializer(i3, text), getCenterStart.IconCompatParcelizer(i3, text));
            i = IconCompatParcelizer + 49;
        }
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i % 2;
        if (!(z ^ z2)) {
            iM3076getStartimpl = androidx.compose.ui.text.TextRange.m3071getEndimpl(jTextRange);
        } else {
            int i5 = IconCompatParcelizer + 51;
            serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            iM3076getStartimpl = androidx.compose.ui.text.TextRange.m3076getStartimpl(jTextRange);
        }
        return accessanyjdVar.IconCompatParcelizer(iM3076getStartimpl);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00b4  */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00d7, code lost:
    
        if (r1 == androidx.compose.ui.text.TextRange.m3071getEndimpl(r2)) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00de, code lost:
    
        if (r1 == androidx.compose.ui.text.TextRange.m3071getEndimpl(r2)) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00e5, code lost:
    
        return r18.IconCompatParcelizer(r13);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final o.accessfoldInjd write(final com.huawei.location.ut r17, final o.accessanyjd r18, o.accessfoldInjd r19) {
        /*
            Method dump skipped, instruction units count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getRequestDisallowInterceptTouchEvent.write(com.huawei.location.ut, o.accessanyjd, o.accessfoldInjd):o.accessfoldInjd");
    }
}
