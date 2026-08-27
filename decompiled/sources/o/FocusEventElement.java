package o;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class FocusEventElement {
    public Uri IconCompatParcelizer;
    public final long MediaSessionCompatQueueItem;
    public String RemoteActionCompatParcelizer;
    public final androidx.core.app.Person read;
    public final Bundle serializer = new Bundle();
    public final CharSequence write;

    public static ArrayList RemoteActionCompatParcelizer(Parcelable[] parcelableArr) {
        String str;
        String str2;
        androidx.core.app.Person personWrite;
        String str3 = "sender";
        String str4 = "sender_person";
        ArrayList arrayList = new ArrayList(parcelableArr.length);
        boolean z = false;
        int i = 0;
        while (i < parcelableArr.length) {
            Parcelable parcelable = parcelableArr[i];
            if (parcelable instanceof Bundle) {
                Bundle bundle = (Bundle) parcelable;
                FocusEventElement focusEventElement = null;
                try {
                    if (bundle.containsKey("text") && bundle.containsKey(CrashHianalyticsData.TIME)) {
                        if (bundle.containsKey("person")) {
                            personWrite = androidx.core.app.Person.IconCompatParcelizer(bundle.getBundle("person"));
                        } else if (bundle.containsKey(str4)) {
                            personWrite = androidx.core.app.Person.write((android.app.Person) bundle.getParcelable(str4));
                        } else if (bundle.containsKey(str3)) {
                            CharSequence charSequence = bundle.getCharSequence(str3);
                            androidx.core.app.Person person = new androidx.core.app.Person();
                            person.write = charSequence;
                            person.read = null;
                            person.MediaDescriptionCompat = null;
                            person.serializer = null;
                            person.RemoteActionCompatParcelizer = z;
                            person.IconCompatParcelizer = z;
                            personWrite = person;
                        } else {
                            personWrite = null;
                        }
                        str = str3;
                        str2 = str4;
                        try {
                            FocusEventElement focusEventElement2 = new FocusEventElement(bundle.getCharSequence("text"), bundle.getLong(CrashHianalyticsData.TIME), personWrite);
                            if (bundle.containsKey("type") && bundle.containsKey("uri")) {
                                String string = bundle.getString("type");
                                Uri uri = (Uri) bundle.getParcelable("uri");
                                focusEventElement2.RemoteActionCompatParcelizer = string;
                                focusEventElement2.IconCompatParcelizer = uri;
                            }
                            if (bundle.containsKey(com.braze.models.inappmessage.InAppMessageBase.EXTRAS)) {
                                focusEventElement2.serializer.putAll(bundle.getBundle(com.braze.models.inappmessage.InAppMessageBase.EXTRAS));
                            }
                            focusEventElement = focusEventElement2;
                        } catch (ClassCastException unused) {
                        }
                    } else {
                        str = str3;
                        str2 = str4;
                    }
                } catch (ClassCastException unused2) {
                }
                if (focusEventElement != null) {
                    arrayList.add(focusEventElement);
                }
            } else {
                str = str3;
                str2 = str4;
            }
            i++;
            str3 = str;
            str4 = str2;
            z = false;
        }
        return arrayList;
    }

    public static Bundle[] IconCompatParcelizer(ArrayList arrayList) {
        Bundle[] bundleArr = new Bundle[arrayList.size()];
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            FocusEventElement focusEventElement = (FocusEventElement) arrayList.get(i);
            androidx.core.app.Person person = focusEventElement.read;
            Bundle bundle = new Bundle();
            CharSequence charSequence = focusEventElement.write;
            if (charSequence != null) {
                bundle.putCharSequence("text", charSequence);
            }
            bundle.putLong(CrashHianalyticsData.TIME, focusEventElement.MediaSessionCompatQueueItem);
            if (person != null) {
                bundle.putCharSequence("sender", person.write);
                bundle.putParcelable("sender_person", FocusEventModifierDefaultImpls.serializer(person.read()));
            }
            String str = focusEventElement.RemoteActionCompatParcelizer;
            if (str != null) {
                bundle.putString("type", str);
            }
            Uri uri = focusEventElement.IconCompatParcelizer;
            if (uri != null) {
                bundle.putParcelable("uri", uri);
            }
            Bundle bundle2 = focusEventElement.serializer;
            if (bundle2 != null) {
                bundle.putBundle(com.braze.models.inappmessage.InAppMessageBase.EXTRAS, bundle2);
            }
            bundleArr[i] = bundle;
        }
        return bundleArr;
    }

    public FocusEventElement(CharSequence charSequence, long j, androidx.core.app.Person person) {
        this.write = charSequence;
        this.MediaSessionCompatQueueItem = j;
        this.read = person;
    }
}
