package o;

import androidx.room.RoomDatabase$closeBarrier$1;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.home.HomeFragment;
import com.roadrunner.home.HomeFragment$initPopupLayer$1;
import com.roadrunner.home.stickyfooter.HomeStickyFooterContentKt;
import com.roadrunner.rider.state.ondemand.offlinebutton.OnDemandOfflineFloatingContentKt;
import io.sentry.util.UrlUtils;
import java.io.Serializable;
import java.util.List;
import kotlin.math.MathKt;
import kotlinx.serialization.SealedClassSerializer$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class updateSubhierarchy implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaBrowserCompatMediaItem = 0;
    private static int RatingCompat = 1;
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ Serializable MediaMetadataCompat;
    public final /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ Object read;
    public final /* synthetic */ Object serializer;
    public final /* synthetic */ Serializable write;

    public /* synthetic */ updateSubhierarchy(Object obj, Object obj2, Object obj3, Serializable serializable, Serializable serializable2, int i) {
        this.IconCompatParcelizer = i;
        this.RemoteActionCompatParcelizer = obj;
        this.serializer = obj2;
        this.read = obj3;
        this.write = serializable;
        this.MediaMetadataCompat = serializable2;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        boolean z2;
        int i = 2 % 2;
        int i2 = this.IconCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        Serializable serializable = this.MediaMetadataCompat;
        Serializable serializable2 = this.write;
        Object obj3 = this.read;
        Object obj4 = this.serializer;
        Object obj5 = this.RemoteActionCompatParcelizer;
        int i3 = 0;
        if (i2 == 0) {
            extractAuthorizationHeader extractauthorizationheader = (extractAuthorizationHeader) obj5;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj4;
            androidx.compose.ui.Modifier modifier = (androidx.compose.ui.Modifier) obj3;
            String str = (String) serializable2;
            String str2 = (String) serializable;
            getBirthDateFull getbirthdatefull = (getBirthDateFull) obj;
            int iIntValue = ((Integer) obj2).intValue();
            if ((iIntValue & 3) != 2) {
                int i4 = MediaBrowserCompatMediaItem + 57;
                RatingCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
                z = true;
            } else {
                z = false;
            }
            getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
            if (getpostalcode.write(1 & iIntValue, z)) {
                extractauthorizationheader.getClass();
                getpostalcode.serializer(-1232538943);
                SealedClassSerializer$$ExternalSyntheticLambda0 sealedClassSerializer$$ExternalSyntheticLambda0IconCompatParcelizer = UrlUtils.IconCompatParcelizer(500L, getpostalcode, 0).IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                getpostalcode.IconCompatParcelizer(false);
                androidx.compose.ui.Modifier modifierM75height3ABfNKs = androidx.compose.foundation.layout.SizeKt.m75height3ABfNKs(modifier, Dimensions.setCustomView);
                getTopLeftannotations gettopleftannotationsIconCompatParcelizer = androidx.compose.foundation.shape.RoundedCornerShapeKt.IconCompatParcelizer(Dimensions.getContentHeight);
                SwitchDefaults switchDefaultsM71PaddingValuesYgX7TsA$default = androidx.compose.foundation.layout.PaddingKt.m71PaddingValuesYgX7TsA$default(Dimensions.getAnimatedVisibility, 0.0f, 2);
                SwitchDefaults switchDefaults = androidx.compose.material3.ButtonDefaults.serializer;
                float f = Dimensions.setGroupDividerEnabled;
                androidx.compose.material3.ButtonKt.Button(sealedClassSerializer$$ExternalSyntheticLambda0IconCompatParcelizer, modifierM75height3ABfNKs, false, gettopleftannotationsIconCompatParcelizer, androidx.compose.material3.ButtonDefaults.RemoteActionCompatParcelizer(((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).getPopupTheme(), 0L, 0L, 0L, getpostalcode, 14), androidx.compose.material3.ButtonDefaults.IconCompatParcelizer(f, f, Dimensions.getTabContainer, f, 0.0f, 16), null, switchDefaultsM71PaddingValuesYgX7TsA$default, null, coil3.ExtrasKt.write(1209494764, new forEachGesturableIntersection(str, i3, str2), getpostalcode), getpostalcode, 805306368, 324);
            } else {
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            }
            return createfromparcel;
        }
        if (i2 == 1) {
            supportFinishAfterTransition supportfinishaftertransition = (supportFinishAfterTransition) obj5;
            getFragment getfragment = (getFragment) obj4;
            HomeFragment$initPopupLayer$1 homeFragment$initPopupLayer$1 = (HomeFragment$initPopupLayer$1) obj3;
            HomeFragment.AnonymousClass1 anonymousClass1 = (HomeFragment.AnonymousClass1) serializable2;
            RoomDatabase$closeBarrier$1 roomDatabase$closeBarrier$1 = (RoomDatabase$closeBarrier$1) serializable;
            getBirthDateFull getbirthdatefull2 = (getBirthDateFull) obj;
            int iIntValue2 = ((Integer) obj2).intValue();
            getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull2;
            if (getpostalcode2.write(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                final BackoffStrategy backoffStrategy = supportfinishaftertransition.MediaSessionCompatQueueItem;
                new DragAndDropTargetModifierNode(new r8lambdahlfuU54MFVLMnThBk7uY9J3wgIM() { // from class: o.Constants
                    private static int RemoteActionCompatParcelizer = 1;
                    private static int serializer;

                    /* JADX WARN: Code duplicated, block: B:36:0x00aa  */
                    /* JADX WARN: Code duplicated, block: B:38:0x00b5  */
                    /* JADX WARN: Code duplicated, block: B:40:0x00ba  */
                    @Override // o.r8lambdahlfuU54MFVLMnThBk7uY9J3wgIM
                    public final Object read(Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11) {
                        int i6;
                        int i7;
                        int i8;
                        int i9;
                        int i10 = 2 % 2;
                        getABI getabi = (getABI) obj6;
                        r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry = (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) obj7;
                        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj8;
                        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj9;
                        getBirthDateFull getbirthdatefull3 = (getBirthDateFull) obj10;
                        int iIntValue3 = ((Integer) obj11).intValue();
                        getabi.getClass();
                        r8lambdafjq9b8d5osr_i2bajdxqnw6rnry.getClass();
                        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
                        r8lambdardpfsr94j4iebcwx_kpqzpm8k1.getClass();
                        if ((iIntValue3 & 6) == 0) {
                            int i11 = RemoteActionCompatParcelizer + 35;
                            serializer = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            int i12 = i11 % 2;
                            i6 = (((getPostalCode) getbirthdatefull3).read(getabi) ? 4 : 2) | iIntValue3;
                        } else {
                            i6 = iIntValue3;
                        }
                        if ((iIntValue3 & 48) == 0) {
                            if (((getPostalCode) getbirthdatefull3).IconCompatParcelizer(r8lambdafjq9b8d5osr_i2bajdxqnw6rnry)) {
                                int i13 = serializer + 35;
                                RemoteActionCompatParcelizer = i13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                i9 = i13 % 2 == 0 ? 80 : 32;
                            } else {
                                i9 = 16;
                            }
                            i6 |= i9;
                            int i14 = serializer + 93;
                            RemoteActionCompatParcelizer = i14 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            int i15 = i14 % 2;
                        }
                        if ((iIntValue3 & 384) == 0) {
                            i6 |= ((getPostalCode) getbirthdatefull3).IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm) ? androidx.compose.ui.graphics.Fields.RotationX : androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        }
                        if ((iIntValue3 & 3072) == 0) {
                            int i16 = serializer + 91;
                            RemoteActionCompatParcelizer = i16 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            if (i16 % 2 == 0) {
                                int i17 = 22 / 0;
                                if (!((getPostalCode) getbirthdatefull3).IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1)) {
                                    i7 = RemoteActionCompatParcelizer + 73;
                                    serializer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                    if (i7 % 2 != 0) {
                                        int i18 = 4 % 5;
                                    }
                                    i8 = androidx.compose.ui.graphics.Fields.RotationZ;
                                } else {
                                    i8 = androidx.compose.ui.graphics.Fields.CameraDistance;
                                }
                            } else if (!((getPostalCode) getbirthdatefull3).IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1)) {
                                i7 = RemoteActionCompatParcelizer + 73;
                                serializer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                if (i7 % 2 != 0) {
                                    int i19 = 4 % 5;
                                }
                                i8 = androidx.compose.ui.graphics.Fields.RotationZ;
                            } else {
                                i8 = androidx.compose.ui.graphics.Fields.CameraDistance;
                            }
                            i6 |= i8;
                        }
                        getPostalCode getpostalcode3 = (getPostalCode) getbirthdatefull3;
                        if (getpostalcode3.write(i6 & 1, (i6 & 9363) != 9362)) {
                            OnDemandOfflineFloatingContentKt.OnDemandOfflineFloatingContent(backoffStrategy.serializer, getabi, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, null, getpostalcode3, 65520 & (i6 << 3));
                        } else {
                            getpostalcode3.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                        }
                        return createFromParcel.INSTANCE;
                    }
                }, true, -1780275269).read(getfragment, homeFragment$initPopupLayer$1, anonymousClass1, roomDatabase$closeBarrier$1, getpostalcode2, 0);
            } else {
                getpostalcode2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            }
            return createfromparcel;
        }
        if (i2 == 2) {
            getDecoratedBoundsWithMarginsInt getdecoratedboundswithmarginsint = (getDecoratedBoundsWithMarginsInt) obj5;
            getChildViewHolderInt getchildviewholderint = (getChildViewHolderInt) obj4;
            HomeFragment$initPopupLayer$1 homeFragment$initPopupLayer$2 = (HomeFragment$initPopupLayer$1) obj3;
            HomeFragment.AnonymousClass1 anonymousClass2 = (HomeFragment.AnonymousClass1) serializable2;
            RoomDatabase$closeBarrier$1 roomDatabase$closeBarrier$2 = (RoomDatabase$closeBarrier$1) serializable;
            getBirthDateFull getbirthdatefull3 = (getBirthDateFull) obj;
            int iIntValue3 = ((Integer) obj2).intValue();
            getPostalCode getpostalcode3 = (getPostalCode) getbirthdatefull3;
            if (getpostalcode3.write(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                MathKt.IconCompatParcelizer((List) coil3.ExtrasKt.write(getdecoratedboundswithmarginsint.write, getpostalcode3, 0).getValue(), getchildviewholderint.MediaMetadataCompat, getchildviewholderint.read, getchildviewholderint.RatingCompat, getchildviewholderint.MediaBrowserCompatMediaItem, getchildviewholderint.RemoteActionCompatParcelizer, getchildviewholderint.MediaSessionCompatQueueItem, getchildviewholderint.serializer, getchildviewholderint.MediaDescriptionCompat, getchildviewholderint.IconCompatParcelizer, homeFragment$initPopupLayer$2, anonymousClass2, roomDatabase$closeBarrier$2, getchildviewholderint.write, getpostalcode3, 0, 0);
            } else {
                getpostalcode3.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            }
            return createfromparcel;
        }
        offsetPositionRecordsForRemove offsetpositionrecordsforremove = (offsetPositionRecordsForRemove) obj5;
        markItemDecorInsetsDirty markitemdecorinsetsdirty = (markItemDecorInsetsDirty) obj4;
        HomeFragment$initPopupLayer$1 homeFragment$initPopupLayer$3 = (HomeFragment$initPopupLayer$1) obj3;
        HomeFragment.AnonymousClass1 anonymousClass3 = (HomeFragment.AnonymousClass1) serializable2;
        RoomDatabase$closeBarrier$1 roomDatabase$closeBarrier$3 = (RoomDatabase$closeBarrier$1) serializable;
        getBirthDateFull getbirthdatefull4 = (getBirthDateFull) obj;
        int iIntValue4 = ((Integer) obj2).intValue();
        if ((iIntValue4 & 3) != 2) {
            int i6 = MediaBrowserCompatMediaItem + 5;
            RatingCompat = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            z2 = true;
        } else {
            z2 = false;
        }
        getPostalCode getpostalcode4 = (getPostalCode) getbirthdatefull4;
        if (getpostalcode4.write(iIntValue4 & 1, z2)) {
            int i8 = RatingCompat + 69;
            MediaBrowserCompatMediaItem = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i9 = i8 % 2;
            HomeStickyFooterContentKt.HomeStickyFooterContent((List) coil3.ExtrasKt.write(offsetpositionrecordsforremove.serializer(), getpostalcode4, 0).getValue(), markitemdecorinsetsdirty.IconCompatParcelizer, homeFragment$initPopupLayer$3, null, anonymousClass3, roomDatabase$closeBarrier$3, getpostalcode4, 0);
        } else {
            getpostalcode4.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        return createfromparcel;
    }
}
