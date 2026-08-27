package androidx.core.app;

import android.app.Notification;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import java.util.Iterator;
import o.FocusEventElement;
import o.FocusEventModifier;
import o.FocusEventModifierDefaultImpls;
import o.accessgetLeftcp;
import o.getEnterdhqQ8s;
import o.getNextdhqQ8s;
import o.getOnFocusEvent;
import o.getRightdhqQ8s;

/* JADX INFO: loaded from: classes.dex */
public final class NotificationCompat$MessagingStyle extends NotificationCompat$Style {
    public Person IconCompatParcelizer;
    public Boolean read;
    public CharSequence serializer;
    public final ArrayList RemoteActionCompatParcelizer = new ArrayList();
    public final ArrayList write = new ArrayList();

    @Override // androidx.core.app.NotificationCompat$Style
    public final String getClassName() {
        return "androidx.core.app.NotificationCompat$MessagingStyle";
    }

    @Override // androidx.core.app.NotificationCompat$Style
    public final void addCompatExtras(Bundle bundle) {
        Bundle bundle2;
        super.addCompatExtras(bundle);
        bundle.putCharSequence("android.selfDisplayName", this.IconCompatParcelizer.write);
        Person person = this.IconCompatParcelizer;
        person.getClass();
        Bundle bundle3 = new Bundle();
        bundle3.putCharSequence("name", person.write);
        IconCompat iconCompat = person.read;
        if (iconCompat != null) {
            bundle2 = new Bundle();
            switch (iconCompat.PlaybackStateCompatCustomAction) {
                case -1:
                    bundle2.putParcelable("obj", (Parcelable) iconCompat.IconCompatParcelizer);
                    break;
                case 0:
                default:
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Invalid icon");
                    return;
                case 1:
                case 5:
                    bundle2.putParcelable("obj", (Bitmap) iconCompat.IconCompatParcelizer);
                    break;
                case 2:
                case 4:
                case 6:
                    bundle2.putString("obj", (String) iconCompat.IconCompatParcelizer);
                    break;
                case 3:
                    bundle2.putByteArray("obj", (byte[]) iconCompat.IconCompatParcelizer);
                    break;
            }
            bundle2.putInt("type", iconCompat.PlaybackStateCompatCustomAction);
            bundle2.putInt("int1", iconCompat.RemoteActionCompatParcelizer);
            bundle2.putInt("int2", iconCompat.read);
            bundle2.putString("string1", iconCompat.RatingCompat);
            ColorStateList colorStateList = iconCompat.MediaBrowserCompatMediaItem;
            if (colorStateList != null) {
                bundle2.putParcelable("tint_list", colorStateList);
            }
            PorterDuff.Mode mode = iconCompat.MediaMetadataCompat;
            if (mode != IconCompat.write) {
                bundle2.putString("tint_mode", mode.name());
            }
        } else {
            bundle2 = null;
        }
        bundle3.putBundle("icon", bundle2);
        bundle3.putString("uri", person.MediaDescriptionCompat);
        bundle3.putString("key", person.serializer);
        bundle3.putBoolean("isBot", person.RemoteActionCompatParcelizer);
        bundle3.putBoolean("isImportant", person.IconCompatParcelizer);
        bundle.putBundle("android.messagingStyleUser", bundle3);
        bundle.putCharSequence("android.hiddenConversationTitle", this.serializer);
        if (this.serializer != null && this.read.booleanValue()) {
            bundle.putCharSequence("android.conversationTitle", this.serializer);
        }
        ArrayList arrayList = this.RemoteActionCompatParcelizer;
        if (!arrayList.isEmpty()) {
            bundle.putParcelableArray("android.messages", FocusEventElement.IconCompatParcelizer(arrayList));
        }
        ArrayList arrayList2 = this.write;
        if (!arrayList2.isEmpty()) {
            bundle.putParcelableArray("android.messages.historic", FocusEventElement.IconCompatParcelizer(arrayList2));
        }
        Boolean bool = this.read;
        if (bool != null) {
            bundle.putBoolean("android.isGroupConversation", bool.booleanValue());
        }
    }

    @Override // androidx.core.app.NotificationCompat$Style
    public final void restoreFromCompatExtras(Bundle bundle) {
        super.restoreFromCompatExtras(bundle);
        ArrayList arrayList = this.RemoteActionCompatParcelizer;
        arrayList.clear();
        if (bundle.containsKey("android.messagingStyleUser")) {
            this.IconCompatParcelizer = Person.IconCompatParcelizer(bundle.getBundle("android.messagingStyleUser"));
        } else {
            String string = bundle.getString("android.selfDisplayName");
            Person person = new Person();
            person.write = string;
            person.read = null;
            person.MediaDescriptionCompat = null;
            person.serializer = null;
            person.RemoteActionCompatParcelizer = false;
            person.IconCompatParcelizer = false;
            this.IconCompatParcelizer = person;
        }
        CharSequence charSequence = bundle.getCharSequence("android.conversationTitle");
        this.serializer = charSequence;
        if (charSequence == null) {
            this.serializer = bundle.getCharSequence("android.hiddenConversationTitle");
        }
        Parcelable[] parcelableArray = bundle.getParcelableArray("android.messages");
        if (parcelableArray != null) {
            arrayList.addAll(FocusEventElement.RemoteActionCompatParcelizer(parcelableArray));
        }
        Parcelable[] parcelableArray2 = bundle.getParcelableArray("android.messages.historic");
        if (parcelableArray2 != null) {
            this.write.addAll(FocusEventElement.RemoteActionCompatParcelizer(parcelableArray2));
        }
        if (bundle.containsKey("android.isGroupConversation")) {
            this.read = Boolean.valueOf(bundle.getBoolean("android.isGroupConversation"));
        }
    }

    public NotificationCompat$MessagingStyle(Person person) {
        if (TextUtils.isEmpty(person.write)) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("User's name must not be empty.");
            throw null;
        }
        this.IconCompatParcelizer = person;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0023  */
    @Override // androidx.core.app.NotificationCompat$Style
    public final void apply(accessgetLeftcp accessgetleftcp) {
        boolean zBooleanValue;
        getEnterdhqQ8s getenterdhqq8s = this.PlaybackStateCompatCustomAction;
        if (getenterdhqq8s == null || getenterdhqq8s.MediaSessionCompatToken.getApplicationInfo().targetSdkVersion >= 28 || this.read != null) {
            Boolean bool = this.read;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            } else {
                zBooleanValue = false;
            }
        } else if (this.serializer != null) {
            zBooleanValue = true;
        } else {
            zBooleanValue = false;
        }
        this.read = Boolean.valueOf(zBooleanValue);
        Notification.MessagingStyle messagingStyleIconCompatParcelizer = getOnFocusEvent.IconCompatParcelizer(this.IconCompatParcelizer.read());
        Iterator it = this.RemoteActionCompatParcelizer.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            FocusEventElement focusEventElement = (FocusEventElement) it.next();
            Person person = focusEventElement.read;
            Notification.MessagingStyle.Message messageIconCompatParcelizer = FocusEventModifierDefaultImpls.IconCompatParcelizer(focusEventElement.write, focusEventElement.MediaSessionCompatQueueItem, person != null ? person.read() : null);
            String str = focusEventElement.RemoteActionCompatParcelizer;
            if (str != null) {
                FocusEventModifier.serializer(messageIconCompatParcelizer, str, focusEventElement.IconCompatParcelizer);
            }
            getNextdhqQ8s.write(messagingStyleIconCompatParcelizer, messageIconCompatParcelizer);
        }
        for (FocusEventElement focusEventElement2 : this.write) {
            Person person2 = focusEventElement2.read;
            Notification.MessagingStyle.Message messageIconCompatParcelizer2 = FocusEventModifierDefaultImpls.IconCompatParcelizer(focusEventElement2.write, focusEventElement2.MediaSessionCompatQueueItem, person2 == null ? null : person2.read());
            String str2 = focusEventElement2.RemoteActionCompatParcelizer;
            if (str2 != null) {
                FocusEventModifier.serializer(messageIconCompatParcelizer2, str2, focusEventElement2.IconCompatParcelizer);
            }
            getRightdhqQ8s.IconCompatParcelizer(messagingStyleIconCompatParcelizer, messageIconCompatParcelizer2);
        }
        this.read.getClass();
        getNextdhqQ8s.write(messagingStyleIconCompatParcelizer, this.serializer);
        getOnFocusEvent.read(messagingStyleIconCompatParcelizer, this.read.booleanValue());
        messagingStyleIconCompatParcelizer.setBuilder(((NotificationCompatBuilder) accessgetleftcp).serializer);
    }

    @Override // androidx.core.app.NotificationCompat$Style
    public final void clearCompatExtraKeys(Bundle bundle) {
        super.clearCompatExtraKeys(bundle);
        bundle.remove("android.messagingStyleUser");
        bundle.remove("android.selfDisplayName");
        bundle.remove("android.conversationTitle");
        bundle.remove("android.hiddenConversationTitle");
        bundle.remove("android.messages");
        bundle.remove("android.messages.historic");
        bundle.remove("android.isGroupConversation");
    }

    public NotificationCompat$MessagingStyle() {
    }
}
