package com.roadrunner.home.floatinglayer;

import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.tooling.data.SlotTreeKt$$ExternalSyntheticLambda0;
import androidx.room.RoomDatabase$$ExternalSyntheticLambda2;
import androidx.room.RoomDatabase$closeBarrier$1;
import androidx.sqlite.SQLite;
import coil3.ExtrasKt;
import com.roadrunner.home.HomeFragment$initPopupLayer$1;
import o.AndroidContentCaptureManager;
import o.DragAndDropTargetModifierNode;
import o.PaintExtensions_androidKt;
import o.PopulateViewStructure_androidKtpopulate7;
import o.StaticLayoutFactory28;
import o.createFromParcel;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getFragment;
import o.getPostalCode;
import o.getQueryContext;
import o.getStripNonMetricAffectingCharSpansannotations;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;
import o.registerInAppMessageManagerlambda0;
import o.supportFinishAfterTransition;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class GetFloatingComposable$$ExternalSyntheticLambda25 implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaDescriptionCompat = 1;
    private static int write;
    public final /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;
    public final /* synthetic */ Object serializer;

    public /* synthetic */ GetFloatingComposable$$ExternalSyntheticLambda25(Object obj, Object obj2, r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, int i) {
        this.read = i;
        this.serializer = obj;
        this.IconCompatParcelizer = obj2;
        this.RemoteActionCompatParcelizer = r8lambdafjq9b8d5osr_i2bajdxqnw6rnry;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x006f  */
    /* JADX WARN: Code duplicated, block: B:34:0x0101  */
    /* JADX WARN: Code duplicated, block: B:46:0x015f  */
    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        AndroidContentCaptureManager androidContentCaptureManager;
        boolean zIconCompatParcelizer;
        Object objComponentActivity;
        int i = 2 % 2;
        int i2 = this.read;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry = this.RemoteActionCompatParcelizer;
        Object obj3 = this.IconCompatParcelizer;
        Object obj4 = this.serializer;
        if (i2 == 0) {
            supportFinishAfterTransition supportfinishaftertransition = (supportFinishAfterTransition) obj4;
            getFragment getfragment = (getFragment) obj3;
            HomeFragment$initPopupLayer$1 homeFragment$initPopupLayer$1 = (HomeFragment$initPopupLayer$1) r8lambdafjq9b8d5osr_i2bajdxqnw6rnry;
            getBirthDateFull getbirthdatefull = (getBirthDateFull) obj;
            int iIntValue = ((Integer) obj2).intValue();
            if ((iIntValue & 3) != 2) {
                int i3 = write + 115;
                MediaDescriptionCompat = i3 % Fields.SpotShadowColor;
                if (i3 % 2 == 0) {
                    z = false;
                } else {
                    z = true;
                }
            } else {
                z = false;
            }
            getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
            if (getpostalcode.write(iIntValue & 1, z)) {
                new DragAndDropTargetModifierNode(new SlotTreeKt$$ExternalSyntheticLambda0(6, supportfinishaftertransition.RatingCompat), true, -484829938).invoke(getfragment, homeFragment$initPopupLayer$1, getpostalcode, 0);
            } else {
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            }
            return createfromparcel;
        }
        getStripNonMetricAffectingCharSpansannotations getstripnonmetricaffectingcharspansannotations = (getStripNonMetricAffectingCharSpansannotations) obj4;
        HomeFragment$initPopupLayer$1 homeFragment$initPopupLayer$2 = (HomeFragment$initPopupLayer$1) obj3;
        DragAndDropTargetModifierNode dragAndDropTargetModifierNode = (DragAndDropTargetModifierNode) r8lambdafjq9b8d5osr_i2bajdxqnw6rnry;
        getBirthDateFull getbirthdatefull2 = (getBirthDateFull) obj;
        int iIntValue2 = ((Integer) obj2).intValue();
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull2;
        if (getpostalcode2.write(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
            int i4 = write + 125;
            MediaDescriptionCompat = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            StaticLayoutFactory28 staticLayoutFactory28 = (StaticLayoutFactory28) getstripnonmetricaffectingcharspansannotations;
            PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7Write = ExtrasKt.write(staticLayoutFactory28.ParcelableVolumeInfo, getpostalcode2, 0);
            PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7Write2 = ExtrasKt.write(staticLayoutFactory28.MediaBrowserCompatMediaItem, getpostalcode2, 0);
            getQueryContext getquerycontext = staticLayoutFactory28.write;
            boolean z2 = getpostalcode2.read(homeFragment$initPopupLayer$2);
            Object objComponentActivity2 = getpostalcode2.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager2 = getCreditCardExpirationMonth.write;
            if (z2) {
                objComponentActivity2 = new RoomDatabase$$ExternalSyntheticLambda2(19, homeFragment$initPopupLayer$2);
                getpostalcode2.write(objComponentActivity2);
            } else {
                int i6 = MediaDescriptionCompat + 109;
                write = i6 % Fields.SpotShadowColor;
                if (i6 % 2 != 0) {
                    int i7 = 84 / 0;
                    if (objComponentActivity2 == androidContentCaptureManager2) {
                        objComponentActivity2 = new RoomDatabase$$ExternalSyntheticLambda2(19, homeFragment$initPopupLayer$2);
                        getpostalcode2.write(objComponentActivity2);
                    }
                } else if (objComponentActivity2 == androidContentCaptureManager2) {
                    objComponentActivity2 = new RoomDatabase$$ExternalSyntheticLambda2(19, homeFragment$initPopupLayer$2);
                    getpostalcode2.write(objComponentActivity2);
                }
            }
            SQLite.write(getquerycontext, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity2, getpostalcode2, 8);
            PaintExtensions_androidKt paintExtensions_androidKt = (PaintExtensions_androidKt) populateViewStructure_androidKtpopulate7Write.getValue();
            Boolean bool = (Boolean) populateViewStructure_androidKtpopulate7Write2.getValue();
            bool.getClass();
            boolean zIconCompatParcelizer2 = getpostalcode2.IconCompatParcelizer(getstripnonmetricaffectingcharspansannotations);
            Object objComponentActivity3 = getpostalcode2.ComponentActivity();
            if (zIconCompatParcelizer2 || objComponentActivity3 == androidContentCaptureManager2) {
                RoomDatabase$closeBarrier$1 roomDatabase$closeBarrier$1 = new RoomDatabase$closeBarrier$1(0, getstripnonmetricaffectingcharspansannotations, getStripNonMetricAffectingCharSpansannotations.class, "onBannerClick", "onBannerClick()V", 0, 5);
                getpostalcode2.write(roomDatabase$closeBarrier$1);
                objComponentActivity3 = roomDatabase$closeBarrier$1;
            }
            registerInAppMessageManagerlambda0 registerinappmessagemanagerlambda0 = (registerInAppMessageManagerlambda0) objComponentActivity3;
            boolean zIconCompatParcelizer3 = getpostalcode2.IconCompatParcelizer(getstripnonmetricaffectingcharspansannotations);
            Object objComponentActivity4 = getpostalcode2.ComponentActivity();
            if (!(!zIconCompatParcelizer3)) {
                androidContentCaptureManager = androidContentCaptureManager2;
            } else {
                androidContentCaptureManager = androidContentCaptureManager2;
                if (objComponentActivity4 == androidContentCaptureManager) {
                }
                registerInAppMessageManagerlambda0 registerinappmessagemanagerlambda1 = (registerInAppMessageManagerlambda0) objComponentActivity4;
                zIconCompatParcelizer = getpostalcode2.IconCompatParcelizer(getstripnonmetricaffectingcharspansannotations);
                objComponentActivity = getpostalcode2.ComponentActivity();
                if (zIconCompatParcelizer || objComponentActivity == androidContentCaptureManager) {
                    RoomDatabase$closeBarrier$1 roomDatabase$closeBarrier$2 = new RoomDatabase$closeBarrier$1(0, getstripnonmetricaffectingcharspansannotations, getStripNonMetricAffectingCharSpansannotations.class, "onBackToBackOrdersBannerDisplayed", "onBackToBackOrdersBannerDisplayed()V", 0, 7);
                    getpostalcode2.write(roomDatabase$closeBarrier$2);
                    objComponentActivity = roomDatabase$closeBarrier$2;
                }
                dragAndDropTargetModifierNode.RemoteActionCompatParcelizer(paintExtensions_androidKt, bool, registerinappmessagemanagerlambda0, registerinappmessagemanagerlambda1, (registerInAppMessageManagerlambda0) objComponentActivity, getpostalcode2, 0);
            }
            RoomDatabase$closeBarrier$1 roomDatabase$closeBarrier$3 = new RoomDatabase$closeBarrier$1(0, getstripnonmetricaffectingcharspansannotations, getStripNonMetricAffectingCharSpansannotations.class, "dismiss", "dismiss()V", 0, 6);
            getpostalcode2.write(roomDatabase$closeBarrier$3);
            objComponentActivity4 = roomDatabase$closeBarrier$3;
            registerInAppMessageManagerlambda0 registerinappmessagemanagerlambda2 = (registerInAppMessageManagerlambda0) objComponentActivity4;
            zIconCompatParcelizer = getpostalcode2.IconCompatParcelizer(getstripnonmetricaffectingcharspansannotations);
            objComponentActivity = getpostalcode2.ComponentActivity();
            if (zIconCompatParcelizer) {
                RoomDatabase$closeBarrier$1 roomDatabase$closeBarrier$4 = new RoomDatabase$closeBarrier$1(0, getstripnonmetricaffectingcharspansannotations, getStripNonMetricAffectingCharSpansannotations.class, "onBackToBackOrdersBannerDisplayed", "onBackToBackOrdersBannerDisplayed()V", 0, 7);
                getpostalcode2.write(roomDatabase$closeBarrier$4);
                objComponentActivity = roomDatabase$closeBarrier$4;
            } else {
                RoomDatabase$closeBarrier$1 roomDatabase$closeBarrier$5 = new RoomDatabase$closeBarrier$1(0, getstripnonmetricaffectingcharspansannotations, getStripNonMetricAffectingCharSpansannotations.class, "onBackToBackOrdersBannerDisplayed", "onBackToBackOrdersBannerDisplayed()V", 0, 7);
                getpostalcode2.write(roomDatabase$closeBarrier$5);
                objComponentActivity = roomDatabase$closeBarrier$5;
            }
            dragAndDropTargetModifierNode.RemoteActionCompatParcelizer(paintExtensions_androidKt, bool, registerinappmessagemanagerlambda0, registerinappmessagemanagerlambda2, (registerInAppMessageManagerlambda0) objComponentActivity, getpostalcode2, 0);
        } else {
            getpostalcode2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            int i8 = MediaDescriptionCompat + 49;
            write = i8 % Fields.SpotShadowColor;
            if (i8 % 2 != 0) {
                int i9 = 3 / 5;
            }
        }
        return createfromparcel;
    }
}
