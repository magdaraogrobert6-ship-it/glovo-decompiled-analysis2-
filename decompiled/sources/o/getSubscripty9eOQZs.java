package o;

import bo.app.c8$$ExternalSyntheticOutline0;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes3.dex */
public abstract class getSubscripty9eOQZs {
    private static int serializer = 0;
    private static int write = 1;

    /* JADX WARN: Code duplicated, block: B:19:0x0051  */
    /* JADX WARN: Code duplicated, block: B:20:0x0054  */
    /* JADX WARN: Code duplicated, block: B:35:0x0089  */
    public static final void write(boolean z, androidx.compose.ui.Modifier modifier, androidx.compose.foundation.interaction.MutableInteractionSourceImpl mutableInteractionSourceImpl, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z2;
        long jRemoveCloseableactivity;
        long jRemoveMenuProvider;
        long jPlaybackStateCompatCustomAction;
        androidx.compose.material3.IconButtonColors iconButtonColors;
        androidx.compose.foundation.interaction.MutableInteractionSourceImpl mutableInteractionSourceImpl2;
        int i3;
        int i4 = 2 % 2;
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(1619978387);
        if ((i & 6) == 0) {
            int i5 = serializer + 83;
            write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            i2 = (getpostalcode.write(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            int i7 = write + 57;
            serializer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i7 % 2 != 0) {
                int i8 = 21 / 0;
                if (getpostalcode.read(modifier)) {
                    i3 = 32;
                } else {
                    i3 = 16;
                }
            } else if (getpostalcode.read(modifier)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
            int i9 = write + 65;
            serializer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i10 = i9 % 2;
        }
        int i11 = i2 | 384;
        if ((i & 3072) == 0) {
            i11 |= !getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? androidx.compose.ui.graphics.Fields.RotationZ : androidx.compose.ui.graphics.Fields.CameraDistance;
        }
        if ((i11 & 1171) != 1170) {
            int i12 = write + 105;
            serializer = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i12 % 2 != 0) {
                z2 = false;
            } else {
                z2 = true;
            }
        } else {
            z2 = false;
        }
        if (!getpostalcode.write(i11 & 1, z2)) {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            mutableInteractionSourceImpl2 = mutableInteractionSourceImpl;
        } else {
            Object objComponentActivity = getpostalcode.ComponentActivity();
            if (objComponentActivity == getCreditCardExpirationMonth.write) {
                objComponentActivity = c8$$ExternalSyntheticOutline0.m(getpostalcode);
            }
            androidx.compose.foundation.interaction.MutableInteractionSourceImpl mutableInteractionSourceImpl3 = (androidx.compose.foundation.interaction.MutableInteractionSourceImpl) objComponentActivity;
            PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7RemoteActionCompatParcelizer = RangesKt.RemoteActionCompatParcelizer(mutableInteractionSourceImpl3, getpostalcode, (i11 >> 6) & 14);
            setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
            long jPlaybackStateCompat = ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).PlaybackStateCompat();
            if (((Boolean) populateViewStructure_androidKtpopulate7RemoteActionCompatParcelizer.getValue()).booleanValue()) {
                getpostalcode.serializer(2021081273);
                jRemoveCloseableactivity = ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).getIndexOfFirstFeature();
                getpostalcode.IconCompatParcelizer(false);
            } else {
                getpostalcode.serializer(2021083256);
                jRemoveCloseableactivity = ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).removeCloseableactivity();
                getpostalcode.IconCompatParcelizer(false);
            }
            long j = jRemoveCloseableactivity;
            int i13 = write + 9;
            serializer = i13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i14 = i13 % 2;
            if (((Boolean) populateViewStructure_androidKtpopulate7RemoteActionCompatParcelizer.getValue()).booleanValue()) {
                getpostalcode.serializer(2021086491);
                jRemoveMenuProvider = ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).removeOnConfigurationChangedListener();
                getpostalcode.IconCompatParcelizer(false);
            } else {
                getpostalcode.serializer(2021088538);
                jRemoveMenuProvider = ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).removeMenuProvider();
                getpostalcode.IconCompatParcelizer(false);
            }
            if (((Boolean) populateViewStructure_androidKtpopulate7RemoteActionCompatParcelizer.getValue()).booleanValue()) {
                getpostalcode.serializer(2021091963);
                jPlaybackStateCompatCustomAction = ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).r8lambda7IJBVrN0sHyidCAZufWEJFc7yY();
                getpostalcode.IconCompatParcelizer(false);
            } else {
                getpostalcode.serializer(2021094010);
                jPlaybackStateCompatCustomAction = ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).PlaybackStateCompatCustomAction();
                getpostalcode.IconCompatParcelizer(false);
            }
            long j2 = jPlaybackStateCompatCustomAction;
            int i15 = serializer + 9;
            write = i15 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i16 = i15 % 2;
            androidx.compose.ui.Modifier modifierM83size3ABfNKs = androidx.compose.foundation.layout.SizeKt.m83size3ABfNKs(modifier, Dimensions.setCustomView);
            getTopLeftannotations gettopleftannotations = androidx.compose.foundation.shape.RoundedCornerShapeKt.IconCompatParcelizer;
            position positionVarSerializer = DefaultPagerNestedScrollConnection.serializer(Dimensions.write, jRemoveMenuProvider);
            androidx.compose.ui.graphics.Color.Companion companion = androidx.compose.ui.graphics.Color.Companion;
            long jM758getUnspecified0d7_KjU = companion.m758getUnspecified0d7_KjU();
            getViewingDistancetKroMQ getviewingdistancetkromq = (getViewingDistancetKroMQ) getpostalcode.write((getNewPassword) getWindowPosturem18o9QQ.serializer);
            long jM732unboximpl = ((androidx.compose.ui.graphics.Color) getpostalcode.write((getNewPassword) UiMediaScopeKeyboardKindCompanion.read)).m732unboximpl();
            androidx.compose.material3.IconButtonColors iconButtonColors2 = getviewingdistancetkromq.MediaSessionCompatQueueItem;
            if (iconButtonColors2 == null) {
                androidx.compose.material3.IconButtonColors iconButtonColors3 = new androidx.compose.material3.IconButtonColors(companion.m757getTransparent0d7_KjU(), jM732unboximpl, companion.m757getTransparent0d7_KjU(), androidx.compose.ui.graphics.Color.m721copywmQWz5c$default(jM732unboximpl, ContentDataTypeCompanion.write, 0.0f, 0.0f, 0.0f, 14, null));
                getviewingdistancetkromq.MediaSessionCompatQueueItem = iconButtonColors3;
                iconButtonColors = iconButtonColors3;
            } else {
                iconButtonColors = iconButtonColors2;
            }
            androidx.compose.material3.IconButtonKt.serializer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifierM83size3ABfNKs, z, gettopleftannotations, iconButtonColors.m115copyjRlVdoo(j2, j, jM758getUnspecified0d7_KjU, jPlaybackStateCompat), positionVarSerializer, mutableInteractionSourceImpl3, getpostalcode, ((i11 << 12) & 3670016) | ((i11 >> 9) & 14) | 12582912 | ((i11 << 6) & 896));
            mutableInteractionSourceImpl2 = mutableInteractionSourceImpl3;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new p6(z, modifier, mutableInteractionSourceImpl2, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, i, 2);
        }
    }
}
