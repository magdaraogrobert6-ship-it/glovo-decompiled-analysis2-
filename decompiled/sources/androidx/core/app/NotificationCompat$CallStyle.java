package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.util.Base64;
import android.util.Log;
import androidx.compose.ui.graphics.Fields;
import androidx.core.graphics.drawable.IconCompat;
import com.logistics.rider.glovo.R;
import java.nio.charset.StandardCharsets;
import o.CacheDrawModifierNodeImpl1;
import o.FocusDirectionCompanion;
import o.accessgetLeftcp;
import o.getDowndhqQ8s;

/* JADX INFO: loaded from: classes.dex */
public final class NotificationCompat$CallStyle extends NotificationCompat$Style {
    private static int ComponentActivity = 0;
    private static byte ParcelableVolumeInfo = -112;
    private static int r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = 1;
    public int IconCompatParcelizer;
    public boolean MediaBrowserCompatMediaItem;
    public Person MediaDescriptionCompat;
    public IconCompat MediaMetadataCompat;
    public PendingIntent MediaSessionCompatQueueItem;
    public CharSequence RatingCompat;
    public PendingIntent RemoteActionCompatParcelizer;
    public PendingIntent read;
    public Integer serializer;
    public Integer write;

    @Override // androidx.core.app.NotificationCompat$Style
    public final boolean displayCustomViewInline() {
        return true;
    }

    @Override // androidx.core.app.NotificationCompat$Style
    public final String getClassName() {
        return "androidx.core.app.NotificationCompat$CallStyle";
    }

    @Override // androidx.core.app.NotificationCompat$Style
    public final void addCompatExtras(Bundle bundle) {
        super.addCompatExtras(bundle);
        bundle.putInt("android.callType", this.IconCompatParcelizer);
        bundle.putBoolean("android.callIsVideo", this.MediaBrowserCompatMediaItem);
        Person person = this.MediaDescriptionCompat;
        if (person != null) {
            bundle.putParcelable("android.callPerson", getDowndhqQ8s.serializer(person.read()));
        }
        IconCompat iconCompat = this.MediaMetadataCompat;
        if (iconCompat != null) {
            bundle.putParcelable("android.verificationIcon", iconCompat.read(this.PlaybackStateCompatCustomAction.MediaSessionCompatToken));
        }
        bundle.putCharSequence("android.verificationText", this.RatingCompat);
        bundle.putParcelable("android.answerIntent", this.read);
        bundle.putParcelable("android.declineIntent", this.RemoteActionCompatParcelizer);
        bundle.putParcelable("android.hangUpIntent", this.MediaSessionCompatQueueItem);
        Integer num = this.write;
        if (num != null) {
            bundle.putInt("android.answerColor", num.intValue());
        }
        Integer num2 = this.serializer;
        if (num2 != null) {
            bundle.putInt("android.declineColor", num2.intValue());
        }
    }

    @Override // androidx.core.app.NotificationCompat$Style
    public final void restoreFromCompatExtras(Bundle bundle) {
        super.restoreFromCompatExtras(bundle);
        this.IconCompatParcelizer = bundle.getInt("android.callType");
        this.MediaBrowserCompatMediaItem = bundle.getBoolean("android.callIsVideo");
        if (bundle.containsKey("android.callPerson")) {
            this.MediaDescriptionCompat = Person.write((android.app.Person) bundle.getParcelable("android.callPerson"));
        } else if (bundle.containsKey("android.callPersonCompat")) {
            this.MediaDescriptionCompat = Person.IconCompatParcelizer(bundle.getBundle("android.callPersonCompat"));
        }
        if (bundle.containsKey("android.verificationIcon")) {
            this.MediaMetadataCompat = IconCompat.RemoteActionCompatParcelizer((Icon) bundle.getParcelable("android.verificationIcon"));
        } else if (bundle.containsKey("android.verificationIconCompat")) {
            this.MediaMetadataCompat = IconCompat.IconCompatParcelizer(bundle.getBundle("android.verificationIconCompat"));
        }
        this.RatingCompat = bundle.getCharSequence("android.verificationText");
        this.read = (PendingIntent) bundle.getParcelable("android.answerIntent");
        this.RemoteActionCompatParcelizer = (PendingIntent) bundle.getParcelable("android.declineIntent");
        this.MediaSessionCompatQueueItem = (PendingIntent) bundle.getParcelable("android.hangUpIntent");
        this.write = bundle.containsKey("android.answerColor") ? Integer.valueOf(bundle.getInt("android.answerColor")) : null;
        this.serializer = bundle.containsKey("android.declineColor") ? Integer.valueOf(bundle.getInt("android.declineColor")) : null;
    }

    @Override // androidx.core.app.NotificationCompat$Style
    public final void apply(accessgetLeftcp accessgetleftcp) {
        String string = null;
        Notification.CallStyle callStyleBa_ = null;
        if (Build.VERSION.SDK_INT >= 31) {
            int i = this.IconCompatParcelizer;
            if (i == 1) {
                callStyleBa_ = FocusDirectionCompanion.ba_(this.MediaDescriptionCompat.read(), this.RemoteActionCompatParcelizer, this.read);
            } else if (i == 2) {
                callStyleBa_ = FocusDirectionCompanion.bb_(this.MediaDescriptionCompat.read(), this.MediaSessionCompatQueueItem);
            } else if (i != 3) {
                Log.isLoggable("NotifCompat", 3);
            } else {
                callStyleBa_ = FocusDirectionCompanion.bc_(this.MediaDescriptionCompat.read(), this.MediaSessionCompatQueueItem, this.read);
            }
            if (callStyleBa_ != null) {
                callStyleBa_.setBuilder(((NotificationCompatBuilder) accessgetleftcp).serializer);
                Integer num = this.write;
                if (num != null) {
                    FocusDirectionCompanion.bd_(callStyleBa_, num.intValue());
                }
                Integer num2 = this.serializer;
                if (num2 != null) {
                    FocusDirectionCompanion.be_(callStyleBa_, num2.intValue());
                }
                FocusDirectionCompanion.bh_(callStyleBa_, this.RatingCompat);
                IconCompat iconCompat = this.MediaMetadataCompat;
                if (iconCompat != null) {
                    FocusDirectionCompanion.bg_(callStyleBa_, iconCompat.read(this.PlaybackStateCompatCustomAction.MediaSessionCompatToken));
                }
                FocusDirectionCompanion.bf_(callStyleBa_, this.MediaBrowserCompatMediaItem);
                return;
            }
            return;
        }
        Notification.Builder builder = ((NotificationCompatBuilder) accessgetleftcp).serializer;
        Person person = this.MediaDescriptionCompat;
        builder.setContentTitle(person != null ? person.write : null);
        Bundle bundle = this.PlaybackStateCompatCustomAction.MediaSessionCompatResultReceiverWrapper;
        CharSequence charSequence = (bundle == null || !bundle.containsKey("android.text")) ? null : this.PlaybackStateCompatCustomAction.MediaSessionCompatResultReceiverWrapper.getCharSequence("android.text");
        if (charSequence == null) {
            int i2 = this.IconCompatParcelizer;
            if (i2 == 1) {
                string = this.PlaybackStateCompatCustomAction.MediaSessionCompatToken.getResources().getString(R.string.call_notification_incoming_text);
            } else if (i2 == 2) {
                string = this.PlaybackStateCompatCustomAction.MediaSessionCompatToken.getResources().getString(R.string.call_notification_ongoing_text);
            } else if (i2 == 3) {
                string = this.PlaybackStateCompatCustomAction.MediaSessionCompatToken.getResources().getString(R.string.call_notification_screening_text);
            }
            charSequence = string;
        }
        builder.setContentText(charSequence);
        Person person2 = this.MediaDescriptionCompat;
        if (person2 != null) {
            IconCompat iconCompat2 = person2.read;
            if (iconCompat2 != null) {
                builder.setLargeIcon(iconCompat2.read(this.PlaybackStateCompatCustomAction.MediaSessionCompatToken));
            }
            getDowndhqQ8s.read(builder, this.MediaDescriptionCompat.read());
        }
        builder.setCategory("call");
    }

    private void a(String str, Object[] objArr) {
        byte[] bArrDecode = Base64.decode(str, 0);
        byte[] bArr = new byte[bArrDecode.length];
        for (int i = 0; i < bArrDecode.length; i++) {
            bArr[i] = (byte) (bArrDecode[(bArrDecode.length - i) - 1] ^ ParcelableVolumeInfo);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }

    public final NotificationCompat$Action serializer(int i, int i2, Integer num, int i3, PendingIntent pendingIntent) {
        int i4 = 2 % 2;
        if (num == null) {
            int i5 = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus + 37;
            ComponentActivity = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            num = Integer.valueOf(this.PlaybackStateCompatCustomAction.MediaSessionCompatToken.getColor(i3));
            int i7 = ComponentActivity + 117;
            r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String string = this.PlaybackStateCompatCustomAction.MediaSessionCompatToken.getResources().getString(i2);
        if (string.startsWith("%('")) {
            int i9 = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus + 73;
            ComponentActivity = i9 % Fields.SpotShadowColor;
            int i10 = i9 % 2;
            Object[] objArr = new Object[1];
            a(string.substring(3), objArr);
            string = ((String) objArr[0]).intern();
        }
        spannableStringBuilder.append((CharSequence) string);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(num.intValue()), 0, spannableStringBuilder.length(), 18);
        Context context = this.PlaybackStateCompatCustomAction.MediaSessionCompatToken;
        PorterDuff.Mode mode = IconCompat.write;
        context.getClass();
        NotificationCompat$Action notificationCompat$ActionIconCompatParcelizer = new CacheDrawModifierNodeImpl1(IconCompat.read(context.getResources(), context.getPackageName(), i), spannableStringBuilder, pendingIntent, new Bundle()).IconCompatParcelizer();
        notificationCompat$ActionIconCompatParcelizer.write.putBoolean("key_action_priority", true);
        return notificationCompat$ActionIconCompatParcelizer;
    }
}
