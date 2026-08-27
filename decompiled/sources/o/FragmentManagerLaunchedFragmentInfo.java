package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class FragmentManagerLaunchedFragmentInfo {
    private static int MediaDescriptionCompat = 1;
    private static int read;
    public final requestPermissions IconCompatParcelizer;
    public final transferSessionPackageI RemoteActionCompatParcelizer;
    public final getHeadingrAG3T2k serializer;
    public final performViewCreated write;

    public FragmentManagerLaunchedFragmentInfo(performViewCreated performviewcreated, requestPermissions requestpermissions, getHeadingrAG3T2k getheadingrag3t2k, transferSessionPackageI transfersessionpackagei) {
        this.write = performviewcreated;
        this.IconCompatParcelizer = requestpermissions;
        this.serializer = getheadingrag3t2k;
        this.RemoteActionCompatParcelizer = transfersessionpackagei;
    }

    public final FragmentManagerSaveBackStackState RemoteActionCompatParcelizer(requireParentFragment requireparentfragment) {
        int i = 2 % 2;
        int i2 = read + 33;
        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        switch (FragmentManagerState.serializer[requireparentfragment.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                FragmentManagerSaveBackStackState fragmentManagerSaveBackStackState = FragmentManagerSaveBackStackState.DEFAULT;
                int i4 = MediaDescriptionCompat + 29;
                read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i4 % 2 == 0) {
                    return fragmentManagerSaveBackStackState;
                }
                throw null;
            case 9:
                return ((FirebaseRemoteConfigImpl) this.RemoteActionCompatParcelizer).IconCompatParcelizer(updateAdidI.IS_HELP_CENTER_BUTTON_REMOVED_FROM_ACCEPT_SCREEN) ? FragmentManagerSaveBackStackState.ACCEPTING_DELIVERIES_NO_HELP_CENTER : FragmentManagerSaveBackStackState.ACCEPTING_DELIVERIES;
            case 10:
                return FragmentManagerSaveBackStackState.LAST_STOP;
            default:
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                int i5 = MediaDescriptionCompat + 77;
                read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i5 % 2 != 0) {
                    int i6 = 90 / 0;
                }
                return null;
        }
    }
}
