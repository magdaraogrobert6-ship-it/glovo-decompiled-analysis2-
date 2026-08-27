package bo.app;

import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.semantics.LiveRegionMode;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import com.braze.BrazeUser;
import com.braze.ui.UserJavascriptInterfaceBase;
import com.braze.ui.actions.brazeactions.steps.AddToSubscriptionGroupStep;
import com.braze.ui.actions.brazeactions.steps.RemoveFromSubscriptionGroupStep;
import com.roadrunner.delivery.pickupdropoff.tasks.domain.RetryCountTrackerImpl;
import com.roadrunner.sidemenu.frequentlyuseditems.FrequentlyUsedItemKt;
import java.util.ArrayList;
import kotlin.LazyKt__LazyJVMKt;
import o.TextFieldValueCompanion;
import o.UncheckedColordefault;
import o.backwardFocusSearch;
import o.createFromParcel;
import o.getCieXyz;
import o.getNoActiveChildannotations;
import o.hideCurrentlyDisplayingInAppMessage;
import o.onViewAttachedToWindowlambda0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.removeNodeAtDepth;
import o.tintxETnrds;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d0$$ExternalSyntheticLambda4 implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ String f$0;

    public /* synthetic */ d0$$ExternalSyntheticLambda4(RetryCountTrackerImpl retryCountTrackerImpl, String str) {
        this.$r8$classId = 21;
        this.f$0 = str;
    }

    public /* synthetic */ d0$$ExternalSyntheticLambda4(String str, int i) {
        this.$r8$classId = i;
        this.f$0 = str;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) throws Exception {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 55;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.$r8$classId;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        String str = this.f$0;
        switch (i4) {
            case 0:
                return Boolean.valueOf(d0.a(str, (a0) obj));
            case 1:
                SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj;
                SemanticsPropertiesKt.m2832setLiveRegionhR3wRGc(semanticsPropertyReceiver, LiveRegionMode.Companion.m2805getAssertive0phEisY());
                SemanticsPropertiesKt.setPaneTitle(semanticsPropertyReceiver, str);
                int i5 = IconCompatParcelizer + 13;
                RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
                if (i5 % 2 != 0) {
                    return createfromparcel;
                }
                throw null;
            case 2:
                SemanticsPropertiesKt.error((SemanticsPropertyReceiver) obj, str);
                return createfromparcel;
            case 3:
                onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0 = (onViewAttachedToWindowlambda0) obj;
                onviewattachedtowindowlambda0.getClass();
                return Boolean.valueOf(((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{onviewattachedtowindowlambda0.serializer, str}, getCieXyz.write())).booleanValue());
            case 4:
                tintxETnrds tintxetnrds = (tintxETnrds) obj;
                tintxetnrds.getClass();
                UncheckedColordefault uncheckedColordefaultRemoteActionCompatParcelizer = tintxetnrds.RemoteActionCompatParcelizer("SELECT name FROM workname WHERE work_spec_id=?");
                try {
                    uncheckedColordefaultRemoteActionCompatParcelizer.IconCompatParcelizer(1, str);
                    ArrayList arrayList = new ArrayList();
                    while (!(!uncheckedColordefaultRemoteActionCompatParcelizer.IconCompatParcelizer())) {
                        arrayList.add(uncheckedColordefaultRemoteActionCompatParcelizer.read(0));
                    }
                    uncheckedColordefaultRemoteActionCompatParcelizer.close();
                    return arrayList;
                } catch (Throwable th) {
                    uncheckedColordefaultRemoteActionCompatParcelizer.close();
                    throw th;
                }
            case 5:
                tintxETnrds tintxetnrds2 = (tintxETnrds) obj;
                tintxetnrds2.getClass();
                UncheckedColordefault uncheckedColordefaultRemoteActionCompatParcelizer2 = tintxetnrds2.RemoteActionCompatParcelizer("UPDATE workspec SET stop_reason = CASE WHEN state=1 THEN 1 ELSE -256 END, state=5 WHERE id=?");
                try {
                    uncheckedColordefaultRemoteActionCompatParcelizer2.IconCompatParcelizer(1, str);
                    uncheckedColordefaultRemoteActionCompatParcelizer2.IconCompatParcelizer();
                    return Integer.valueOf(((Integer) LazyKt__LazyJVMKt.IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), 1469081550, -1469081547, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), new Object[]{tintxetnrds2})).intValue());
                } finally {
                    uncheckedColordefaultRemoteActionCompatParcelizer2.close();
                }
            case 6:
                tintxETnrds tintxetnrds3 = (tintxETnrds) obj;
                tintxetnrds3.getClass();
                UncheckedColordefault uncheckedColordefaultRemoteActionCompatParcelizer3 = tintxetnrds3.RemoteActionCompatParcelizer("UPDATE workspec SET run_attempt_count=0 WHERE id=?");
                try {
                    uncheckedColordefaultRemoteActionCompatParcelizer3.IconCompatParcelizer(1, str);
                    uncheckedColordefaultRemoteActionCompatParcelizer3.IconCompatParcelizer();
                    return Integer.valueOf(((Integer) LazyKt__LazyJVMKt.IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), 1469081550, -1469081547, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), new Object[]{tintxetnrds3})).intValue());
                } finally {
                    uncheckedColordefaultRemoteActionCompatParcelizer3.close();
                }
            case 7:
                tintxETnrds tintxetnrds4 = (tintxETnrds) obj;
                tintxetnrds4.getClass();
                UncheckedColordefault uncheckedColordefaultRemoteActionCompatParcelizer4 = tintxetnrds4.RemoteActionCompatParcelizer("UPDATE workspec SET period_count=period_count+1 WHERE id=?");
                try {
                    uncheckedColordefaultRemoteActionCompatParcelizer4.IconCompatParcelizer(1, str);
                    uncheckedColordefaultRemoteActionCompatParcelizer4.IconCompatParcelizer();
                    return createfromparcel;
                } finally {
                    uncheckedColordefaultRemoteActionCompatParcelizer4.close();
                }
            case 8:
                return UserJavascriptInterfaceBase.setLanguage$lambda$0(str, (BrazeUser) obj);
            case 9:
                return UserJavascriptInterfaceBase.addToSubscriptionGroup$lambda$0(str, (BrazeUser) obj);
            case 10:
                return UserJavascriptInterfaceBase.removeFromSubscriptionGroup$lambda$0(str, (BrazeUser) obj);
            case 11:
                return UserJavascriptInterfaceBase.setCountry$lambda$0(str, (BrazeUser) obj);
            case 12:
                return UserJavascriptInterfaceBase.setFirstName$lambda$0(str, (BrazeUser) obj);
            case 13:
                return UserJavascriptInterfaceBase.setHomeCity$lambda$0(str, (BrazeUser) obj);
            case 14:
                return UserJavascriptInterfaceBase.setPhoneNumber$lambda$0(str, (BrazeUser) obj);
            case 15:
                return UserJavascriptInterfaceBase.setEmail$lambda$0(str, (BrazeUser) obj);
            case 16:
                return UserJavascriptInterfaceBase.setLineId$lambda$0(str, (BrazeUser) obj);
            case 17:
                return UserJavascriptInterfaceBase.setLastName$lambda$0(str, (BrazeUser) obj);
            case 18:
                createFromParcel createfromparcelRun$lambda$0 = AddToSubscriptionGroupStep.run$lambda$0(str, (BrazeUser) obj);
                int i6 = IconCompatParcelizer + 67;
                RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
                return createfromparcelRun$lambda$0;
            case 19:
                return RemoveFromSubscriptionGroupStep.run$lambda$0(str, (BrazeUser) obj);
            case 20:
                TextFieldValueCompanion textFieldValueCompanion = (TextFieldValueCompanion) obj;
                textFieldValueCompanion.getClass();
                return Boolean.valueOf(((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{textFieldValueCompanion.path, str}, getCieXyz.write())).booleanValue());
            case 21:
                getNoActiveChildannotations getnoactivechildannotations = (getNoActiveChildannotations) obj;
                getnoactivechildannotations.getClass();
                Integer num = (Integer) ((backwardFocusSearch) getnoactivechildannotations).RemoteActionCompatParcelizer.get(RetryCountTrackerImpl.serializer(str));
                return Integer.valueOf(num != null ? num.intValue() : 0);
            default:
                String str2 = (String) obj;
                str2.getClass();
                if (!hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str2)) {
                    return str.concat(str2);
                }
                int i8 = IconCompatParcelizer + 117;
                RemoteActionCompatParcelizer = i8 % Fields.SpotShadowColor;
                if (i8 % 2 != 0) {
                    return str2.length() < str.length() ? str : str2;
                }
                str2.length();
                str.length();
                throw null;
        }
    }
}
