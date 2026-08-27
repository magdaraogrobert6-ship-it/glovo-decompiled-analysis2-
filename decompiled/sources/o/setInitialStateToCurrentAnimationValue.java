package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.delivery.state.pudo.TagIconTokenV1;
import java.util.List;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class setInitialStateToCurrentAnimationValue {
    private static int IconCompatParcelizer = 0;
    private static int serializer = 1;
    public final AndroidUiFrameClock RemoteActionCompatParcelizer;

    public setInitialStateToCurrentAnimationValue(AndroidUiFrameClock androidUiFrameClock) {
        androidUiFrameClock.getClass();
        this.RemoteActionCompatParcelizer = androidUiFrameClock;
    }

    public final ComposeAnimationState serializer(getDismissOnBackPress getdismissonbackpress) {
        Integer numIconCompatParcelizer;
        int i = 2 % 2;
        int i2 = serializer + 81;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        getdismissonbackpress.getClass();
        TagIconTokenV1 tagIconTokenV1IconCompatParcelizer = getdismissonbackpress.IconCompatParcelizer();
        getNoopState getnoopstateWrite = null;
        if (tagIconTokenV1IconCompatParcelizer != null) {
            int i4 = IconCompatParcelizer + 101;
            serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                this.RemoteActionCompatParcelizer.getClass();
                AndroidUiFrameClock.IconCompatParcelizer(tagIconTokenV1IconCompatParcelizer);
                getnoopstateWrite.hashCode();
                throw null;
            }
            this.RemoteActionCompatParcelizer.getClass();
            numIconCompatParcelizer = AndroidUiFrameClock.IconCompatParcelizer(tagIconTokenV1IconCompatParcelizer);
        } else {
            numIconCompatParcelizer = null;
        }
        String strRemoteActionCompatParcelizer = getdismissonbackpress.RemoteActionCompatParcelizer();
        getWindowTitle getwindowtitleSerializer = getdismissonbackpress.serializer();
        if (getwindowtitleSerializer != null) {
            int i5 = IconCompatParcelizer + 83;
            serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            getnoopstateWrite = write(getwindowtitleSerializer);
        }
        getNoopState getnoopstate = getnoopstateWrite;
        List list = getdismissonbackpress.read();
        if (list == null) {
            int i7 = serializer + 117;
            IconCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i7 % 2 != 0) {
                list = instance_delegatelambda0.write;
                int i8 = 44 / 0;
            } else {
                list = instance_delegatelambda0.write;
            }
        }
        ComposeAnimationState composeAnimationState = new ComposeAnimationState(numIconCompatParcelizer, strRemoteActionCompatParcelizer, getnoopstate, list, getdismissonbackpress.write());
        int i9 = serializer + 125;
        IconCompatParcelizer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i10 = i9 % 2;
        return composeAnimationState;
    }

    public static getNoopState write(getWindowTitle getwindowtitle) {
        int i = 2 % 2;
        if (getwindowtitle instanceof getSecurePolicy) {
            getSecurePolicy getsecurepolicy = (getSecurePolicy) getwindowtitle;
            return new UnsupportedSearchInfo(getsecurepolicy.serializer(), getsecurepolicy.read(), getsecurepolicy.write());
        }
        if (getwindowtitle instanceof DialogWindowProvider) {
            return new findParameters(((DialogWindowProvider) getwindowtitle).RemoteActionCompatParcelizer());
        }
        Object obj = null;
        if (getwindowtitle instanceof getWindowToken) {
            int i2 = IconCompatParcelizer + 7;
            serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                return CompositionDataTree.INSTANCE;
            }
            CompositionDataTree compositionDataTree = CompositionDataTree.INSTANCE;
            obj.hashCode();
            throw null;
        }
        if (getwindowtitle instanceof getWindowType) {
            return mapTree.INSTANCE;
        }
        if (getwindowtitle instanceof r8lambdaDj_KSJwPa9A3r02U9qVyNCgJjqs) {
            r8lambdaDj_KSJwPa9A3r02U9qVyNCgJjqs r8lambdadj_ksjwpa9a3r02u9qvyncgjjqs = (r8lambdaDj_KSJwPa9A3r02U9qVyNCgJjqs) getwindowtitle;
            return new showSystemUi(r8lambdadj_ksjwpa9a3r02u9qvyncgjjqs.IconCompatParcelizer(), r8lambdadj_ksjwpa9a3r02u9qvyncgjjqs.RemoteActionCompatParcelizer(), r8lambdadj_ksjwpa9a3r02u9qvyncgjjqs.serializer(), r8lambdadj_ksjwpa9a3r02u9qvyncgjjqs.write(), r8lambdadj_ksjwpa9a3r02u9qvyncgjjqs.read());
        }
        if (!(getwindowtitle instanceof getWindowBounds)) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
            return null;
        }
        Timber.RemoteActionCompatParcelizer.write(new IllegalArgumentException("Unknown component action type received: " + getwindowtitle));
        int i3 = serializer + 79;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            return null;
        }
        throw null;
    }
}
