package o;

import android.app.Application;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.util.Base64;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.ranges.RangesKt;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class getTextDirections_7Xco {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int MediaDescriptionCompat = 0;
    private static byte MediaSessionCompatQueueItem = -112;
    public String IconCompatParcelizer;
    public final LinkedHashMap RemoteActionCompatParcelizer;
    public final SharedPreferences read;
    public final registerOnChangedCallback serializer;
    public final setTransactionSuccessful write;

    public getTextDirections_7Xco(registerOnChangedCallback registeronchangedcallback, setTransactionSuccessful settransactionsuccessful, SharedPreferences sharedPreferences) {
        registeronchangedcallback.getClass();
        settransactionsuccessful.getClass();
        sharedPreferences.getClass();
        this.serializer = registeronchangedcallback;
        this.write = settransactionsuccessful;
        this.read = sharedPreferences;
        this.RemoteActionCompatParcelizer = new LinkedHashMap();
    }

    private void a(String str, Object[] objArr) {
        byte[] bArrDecode = Base64.decode(str, 0);
        byte[] bArr = new byte[bArrDecode.length];
        for (int i = 0; i < bArrDecode.length; i++) {
            bArr[i] = (byte) (bArrDecode[(bArrDecode.length - i) - 1] ^ MediaSessionCompatQueueItem);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }

    public final List RemoteActionCompatParcelizer(List list) {
        ArrayList arrayList;
        int i;
        int i2;
        String string;
        int i3 = 2;
        int i4 = 2 % 2;
        setTransactionSuccessful settransactionsuccessful = this.write;
        Object obj = null;
        String string2 = this.read.getString(settransactionsuccessful.IconCompatParcelizer(com.logistics.rider.glovo.R.string.preference_chat_language), null);
        FirebaseRemoteConfigImpl firebaseRemoteConfigImpl = (FirebaseRemoteConfigImpl) ((accessanalyzeComponents58bKbWc) this.serializer).serializer;
        firebaseRemoteConfigImpl.getClass();
        if (!firebaseRemoteConfigImpl.IconCompatParcelizer(updateAdidI.IS_QUICK_REPLIES_LOCALIZATION_ENABLED) || string2 == null) {
            string2 = null;
        } else {
            int i5 = MediaBrowserCompatMediaItem + 95;
            MediaDescriptionCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
        }
        int i6 = 1803334089;
        boolean zBooleanValue = ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{string2, this.IconCompatParcelizer}, getCieXyz.write())).booleanValue();
        LinkedHashMap linkedHashMap = this.RemoteActionCompatParcelizer;
        if (!zBooleanValue) {
            int i7 = MediaBrowserCompatMediaItem + 71;
            MediaDescriptionCompat = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i7 % 2 != 0) {
                linkedHashMap.clear();
                this.IconCompatParcelizer = string2;
                obj.hashCode();
                throw null;
            }
            linkedHashMap.clear();
            this.IconCompatParcelizer = string2;
        }
        ParagraphStyleKt paragraphStyleKt = new ParagraphStyleKt(string2, list);
        List list2 = (List) linkedHashMap.get(paragraphStyleKt);
        if (list2 != null) {
            return list2;
        }
        int i8 = 10;
        char c = 1;
        if (string2 != null) {
            List<String> list3 = list;
            arrayList = new ArrayList(accessgetInstancedelegatecp.write(list3, 10));
            for (String str : list3) {
                Application application = settransactionsuccessful.RemoteActionCompatParcelizer;
                str.getClass();
                int identifier = application.getResources().getIdentifier(str, "string", application.getPackageName());
                try {
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), i6, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{settransactionsuccessful.read().getLanguage(), string2}, getCieXyz.write())).booleanValue()) {
                        string = settransactionsuccessful.IconCompatParcelizer(identifier);
                        i = i6;
                        i2 = i3;
                    } else {
                        Configuration configuration = new Configuration(application.getResources().getConfiguration());
                        java.util.Locale locale = new java.util.Locale(string2);
                        int size = configuration.getLocales().size();
                        try {
                            Object[] objArr = new Object[i3];
                            try {
                                objArr[0] = 0;
                                objArr[c] = Integer.valueOf(size);
                                ensureSubscribedToInAppMessageEventslambda7 ensuresubscribedtoinappmessageeventslambda7 = (ensureSubscribedToInAppMessageEventslambda7) RangesKt.read(281231685, BackspaceCommand.write(), BackspaceCommand.write(), objArr, BackspaceCommand.write(), -281231677, BackspaceCommand.write());
                                ArrayList arrayList2 = new ArrayList(accessgetInstancedelegatecp.write(ensuresubscribedtoinappmessageeventslambda7, i8));
                                getInAppMessageStackannotations it = ensuresubscribedtoinappmessageeventslambda7.iterator();
                                while (it.RemoteActionCompatParcelizer) {
                                    arrayList2.add(configuration.getLocales().get(it.RemoteActionCompatParcelizer()));
                                }
                                int iSerializer = getQueryParameterslambda2.serializer();
                                List list4 = (List) androidx.sqlite.SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, new Object[]{locale}, getQueryParameterslambda2.serializer(), -516583649, iSerializer);
                                ArrayList arrayList3 = new ArrayList();
                                Iterator it2 = arrayList2.iterator();
                                while (it2.hasNext()) {
                                    try {
                                        Object next = it2.next();
                                        Iterator it3 = it2;
                                        java.util.Locale locale2 = locale;
                                        i = 1803334089;
                                        try {
                                            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{(java.util.Locale) next, locale}, getCieXyz.write())).booleanValue()) {
                                                arrayList3.add(next);
                                            }
                                            it2 = it3;
                                            locale = locale2;
                                        } catch (Throwable th) {
                                            th = th;
                                            i2 = 2;
                                            Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(th, "getStringInLanguage failed for: key=" + identifier + ", language=" + string2, new Object[0]);
                                            string = "";
                                            arrayList.add(string);
                                            i3 = i2;
                                            i6 = i;
                                            i8 = 10;
                                            c = 1;
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        i = 1803334089;
                                    }
                                }
                                i = 1803334089;
                                java.util.Locale[] localeArr = (java.util.Locale[]) onContentCardDismissed.IconCompatParcelizer(arrayList3, list4).toArray(new java.util.Locale[0]);
                                configuration.setLocales(new android.os.LocaleList((java.util.Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
                                string = application.createConfigurationContext(configuration).getString(identifier);
                                if (string.startsWith("%('")) {
                                    int i9 = MediaBrowserCompatMediaItem + 83;
                                    MediaDescriptionCompat = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                    i2 = 2;
                                    int i10 = i9 % 2;
                                    try {
                                        Object[] objArr2 = new Object[1];
                                        a(string.substring(3), objArr2);
                                        string = ((String) objArr2[0]).intern();
                                    } catch (Throwable th3) {
                                        th = th3;
                                        Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(th, "getStringInLanguage failed for: key=" + identifier + ", language=" + string2, new Object[0]);
                                        string = "";
                                    }
                                } else {
                                    i2 = 2;
                                }
                                string.getClass();
                            } catch (Throwable th4) {
                                th = th4;
                                i2 = 2;
                                i = 1803334089;
                                Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(th, "getStringInLanguage failed for: key=" + identifier + ", language=" + string2, new Object[0]);
                                string = "";
                                arrayList.add(string);
                                i3 = i2;
                                i6 = i;
                                i8 = 10;
                                c = 1;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            i2 = i3;
                        }
                    }
                } catch (Throwable th6) {
                    th = th6;
                    i = i6;
                    i2 = i3;
                }
                arrayList.add(string);
                i3 = i2;
                i6 = i;
                i8 = 10;
                c = 1;
            }
        } else {
            List list5 = list;
            arrayList = new ArrayList(accessgetInstancedelegatecp.write(list5, 10));
            Iterator it4 = list5.iterator();
            while (it4.hasNext()) {
                arrayList.add(settransactionsuccessful.read((String) it4.next()));
            }
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (((String) obj2).length() > 0) {
                arrayList4.add(obj2);
            }
        }
        linkedHashMap.put(paragraphStyleKt, arrayList4);
        return arrayList4;
    }
}
