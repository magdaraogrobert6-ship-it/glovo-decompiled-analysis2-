package com.roadrunner.web.presentation.authWebView;

import android.os.Bundle;
import android.view.View;
import androidx.compose.ui.graphics.Fields;
import com.roadrunner.tnc.TncContentKt$$ExternalSyntheticLambda2;
import com.roadrunner.web.presentation.WebViewFragment;
import com.roadrunner.web.presentation.authWebView.AuthWebViewModel;
import kotlin.jvm.internal.FunctionReferenceImpl;
import o.ActualSweepGradientShader9KIMszo;
import o.BrazeExternalSyntheticLambda205;
import o.isInvalidIndex;
import o.r8lambdatEa7vanKJhASEs7P3j5N2RjkfeQ;
import o.unregisterComponentCallback;

/* JADX INFO: loaded from: classes3.dex */
public abstract class AuthBaseWebFragment<VM extends AuthWebViewModel> extends WebViewFragment {
    private static int removeOnMultiWindowModeChangedListener = 0;
    private static int removeOnPictureInPictureUiStateChangedListener = 1;

    /* JADX INFO: renamed from: com.roadrunner.web.presentation.authWebView.AuthBaseWebFragment$onViewCreated$1, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass1 implements unregisterComponentCallback, r8lambdatEa7vanKJhASEs7P3j5N2RjkfeQ {
        private static int IconCompatParcelizer = 0;
        private static int RemoteActionCompatParcelizer = 1;
        public final /* synthetic */ AuthBaseWebFragment read;
        public final /* synthetic */ int write;

        public /* synthetic */ AnonymousClass1(AuthBaseWebFragment authBaseWebFragment, int i) {
            this.write = i;
            this.read = authBaseWebFragment;
        }

        public final int hashCode() {
            int i = 2 % 2;
            int i2 = RemoteActionCompatParcelizer + 7;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            if (this.write != 0) {
                return getFunctionDelegate().hashCode();
            }
            int iHashCode = getFunctionDelegate().hashCode();
            int i4 = RemoteActionCompatParcelizer + 117;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return iHashCode;
        }

        @Override // o.unregisterComponentCallback
        public final void RemoteActionCompatParcelizer(Object obj) {
            int i = 2 % 2;
            int i2 = RemoteActionCompatParcelizer + 99;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                throw null;
            }
            int i3 = this.write;
            AuthBaseWebFragment authBaseWebFragment = this.read;
            if (i3 != 0) {
                BrazeExternalSyntheticLambda205 brazeExternalSyntheticLambda205 = (BrazeExternalSyntheticLambda205) obj;
                brazeExternalSyntheticLambda205.getClass();
                authBaseWebFragment.serializer(brazeExternalSyntheticLambda205.write);
                int i4 = RemoteActionCompatParcelizer + 5;
                IconCompatParcelizer = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                return;
            }
            BrazeExternalSyntheticLambda205 brazeExternalSyntheticLambda206 = (BrazeExternalSyntheticLambda205) obj;
            brazeExternalSyntheticLambda206.getClass();
            authBaseWebFragment.serializer(brazeExternalSyntheticLambda206.serializer);
            int i6 = IconCompatParcelizer + 105;
            RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
            if (i6 % 2 == 0) {
                int i7 = 35 / 0;
            }
        }

        @Override // o.r8lambdatEa7vanKJhASEs7P3j5N2RjkfeQ
        public final isInvalidIndex getFunctionDelegate() {
            int i = 2 % 2;
            int i2 = IconCompatParcelizer + 1;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            if (this.write == 0) {
                return new FunctionReferenceImpl(1, 0, AuthBaseWebFragment.class, this.read, "setWebView", "setWebView(Lcom/roadrunner/web/model/WebDataViewEntity;)V");
            }
            FunctionReferenceImpl functionReferenceImpl = new FunctionReferenceImpl(1, 0, AuthBaseWebFragment.class, this.read, "updateCredentials", "updateCredentials(Lcom/roadrunner/web/model/WebDataViewEntity;)V");
            int i4 = RemoteActionCompatParcelizer + 3;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                return functionReferenceImpl;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final boolean equals(Object obj) {
            int i = 2 % 2;
            int i2 = RemoteActionCompatParcelizer;
            int i3 = i2 + 81;
            IconCompatParcelizer = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            if (this.write == 0) {
                if (!(obj instanceof unregisterComponentCallback) || !(obj instanceof r8lambdatEa7vanKJhASEs7P3j5N2RjkfeQ)) {
                    return false;
                }
                boolean zEquals = getFunctionDelegate().equals(((r8lambdatEa7vanKJhASEs7P3j5N2RjkfeQ) obj).getFunctionDelegate());
                int i5 = IconCompatParcelizer + 71;
                RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                return zEquals;
            }
            if (!(obj instanceof unregisterComponentCallback)) {
                return false;
            }
            int i7 = i2 + 89;
            IconCompatParcelizer = i7 % Fields.SpotShadowColor;
            if (i7 % 2 != 0) {
                boolean z = obj instanceof r8lambdatEa7vanKJhASEs7P3j5N2RjkfeQ;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            if (!(obj instanceof r8lambdatEa7vanKJhASEs7P3j5N2RjkfeQ)) {
                return false;
            }
            boolean zEquals2 = getFunctionDelegate().equals(((r8lambdatEa7vanKJhASEs7P3j5N2RjkfeQ) obj).getFunctionDelegate());
            int i8 = RemoteActionCompatParcelizer + 45;
            IconCompatParcelizer = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
            return zEquals2;
        }
    }

    public abstract AuthWebViewModel PlaybackStateCompatCustomAction();

    @Override // com.roadrunner.web.presentation.WebViewFragment
    public final void MediaDescriptionCompat() {
        int i = 2 % 2;
        int i2 = removeOnMultiWindowModeChangedListener + 103;
        removeOnPictureInPictureUiStateChangedListener = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            PlaybackStateCompatCustomAction().serializer();
        } else {
            PlaybackStateCompatCustomAction().serializer();
            int i3 = 36 / 0;
        }
    }

    @Override // com.roadrunner.web.presentation.WebViewFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        int i = 2 % 2;
        view.getClass();
        super.onViewCreated(view, bundle);
        PlaybackStateCompatCustomAction().write();
        PlaybackStateCompatCustomAction().IconCompatParcelizer().serializer(getViewLifecycleOwner(), new AnonymousClass1(this, 0));
        PlaybackStateCompatCustomAction().read().serializer(getViewLifecycleOwner(), new AnonymousClass1(this, 1));
        PlaybackStateCompatCustomAction().RemoteActionCompatParcelizer().serializer(getViewLifecycleOwner(), new ActualSweepGradientShader9KIMszo(new TncContentKt$$ExternalSyntheticLambda2(24, this), 6));
        int i2 = removeOnMultiWindowModeChangedListener + 123;
        removeOnPictureInPictureUiStateChangedListener = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
