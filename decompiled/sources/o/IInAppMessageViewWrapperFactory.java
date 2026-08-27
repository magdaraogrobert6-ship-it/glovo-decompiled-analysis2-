package o;

import androidx.savedstate.internal.SavedStateRegistryImpl$$ExternalSyntheticLambda0;
import io.sentry.android.core.AppState$$ExternalSyntheticLambda0;
import java.util.Iterator;
import java.util.List;
import okio.Okio;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class IInAppMessageViewWrapperFactory implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    public final /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ int serializer;
    public final /* synthetic */ Object write;

    public /* synthetic */ IInAppMessageViewWrapperFactory(Object obj, int i, Object obj2) {
        this.serializer = i;
        this.write = obj;
        this.IconCompatParcelizer = obj2;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        Object next;
        int i = 2;
        int i2 = 2 % 2;
        int i3 = this.serializer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        Object obj2 = this.IconCompatParcelizer;
        Object obj3 = this.write;
        Object obj4 = null;
        if (i3 == 0) {
            ((IInAppMessageViewFactory) obj3).RemoteActionCompatParcelizer.removeCallbacks((AppState$$ExternalSyntheticLambda0) obj2);
            int i4 = RemoteActionCompatParcelizer + 123;
            read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                return createfromparcel;
            }
            obj4.hashCode();
            throw null;
        }
        if (i3 != 1) {
            if (i3 != 2) {
                accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp = (accessisRenderNodeCompatiblecp) obj3;
                ((getPersonNamePrefix) obj).getClass();
                SavedStateRegistryImpl$$ExternalSyntheticLambda0 savedStateRegistryImpl$$ExternalSyntheticLambda0 = new SavedStateRegistryImpl$$ExternalSyntheticLambda0(i, (PopulateViewStructure_androidKtpopulate7) obj2);
                accessisrendernodecompatiblecp.getLifecycle().IconCompatParcelizer(savedStateRegistryImpl$$ExternalSyntheticLambda0);
                return new addMenuProvider(accessisrendernodecompatiblecp, 7, savedStateRegistryImpl$$ExternalSyntheticLambda0);
            }
            androidx.fragment.app.FragmentActivity fragmentActivity = (androidx.fragment.app.FragmentActivity) obj2;
            String str = (String) obj;
            str.getClass();
            r8lambda93S_WWydVO4tgS0mQqqSoxDXifE r8lambda93s_wwydvo4tgs0mqqqsoxdxife = ((waitTime) obj3).serializer;
            div7Ah8Wj8 supportFragmentManager = fragmentActivity.getSupportFragmentManager();
            supportFragmentManager.getClass();
            r8lambda5hznbMbgdS2eCZLmHROk6qxRFRo r8lambda5hznbmbgds2eczlmhrok6qxrfroRemoteActionCompatParcelizer = ((r8lambda7N09UYmlXn1od8eOh6S1lYPo8aE) r8lambda93s_wwydvo4tgs0mqqqsoxdxife.RemoteActionCompatParcelizer.IconCompatParcelizer).RemoteActionCompatParcelizer(com.logistics.rider.glovo.R.string.available_shifts, "/app/rooster/web/shifts?nested_mode", "Rooster Available Shifts");
            r8lambdaLZjsjPSXWRendXZH98LKrH6PSs.read(r8lambda93s_wwydvo4tgs0mqqqsoxdxife.read, fragmentActivity, supportFragmentManager, r8lambda93s_wwydvo4tgs0mqqqsoxdxife.write.IconCompatParcelizer(r8lambda5hznbmbgds2eczlmhrok6qxrfroRemoteActionCompatParcelizer.serializer()), str, r8lambda5hznbmbgds2eczlmhrok6qxrfroRemoteActionCompatParcelizer.write(), "Rooster");
            return createfromparcel;
        }
        tintxETnrds tintxetnrds = (tintxETnrds) obj;
        tintxetnrds.getClass();
        isIdentity58bKbWc isidentity58bkbwc = ((resolveClass) obj3).RemoteActionCompatParcelizer;
        List list = (List) obj2;
        if (list != null) {
            UncheckedColordefault uncheckedColordefaultRemoteActionCompatParcelizer = tintxetnrds.RemoteActionCompatParcelizer("INSERT OR REPLACE INTO `work_opportunity` (`id`,`type`,`description`,`zone_name`,`zone_geo_json`,`center_geo_json`,`bonus_types`,`bonus_multiplier`,`calender_enabled`,`subzones`,`start_time`) VALUES (?,?,?,?,?,?,?,?,?,?,?)");
            try {
                Iterator it = list.iterator();
                int i5 = read + 51;
                RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                loop0: while (true) {
                    int i6 = i5 % 2;
                    do {
                        if (!it.hasNext()) {
                            Okio.RemoteActionCompatParcelizer(uncheckedColordefaultRemoteActionCompatParcelizer, null);
                            break loop0;
                        }
                        int i7 = RemoteActionCompatParcelizer + 37;
                        read = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        if (i7 % 2 == 0) {
                            it.next();
                            obj4.hashCode();
                            throw null;
                        }
                        next = it.next();
                    } while (next == null);
                    isidentity58bkbwc.write(uncheckedColordefaultRemoteActionCompatParcelizer, next);
                    uncheckedColordefaultRemoteActionCompatParcelizer.IconCompatParcelizer();
                    uncheckedColordefaultRemoteActionCompatParcelizer.write();
                    i5 = RemoteActionCompatParcelizer + 37;
                    read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    Okio.RemoteActionCompatParcelizer(uncheckedColordefaultRemoteActionCompatParcelizer, th);
                    throw th2;
                }
            }
        }
        return createfromparcel;
    }
}
