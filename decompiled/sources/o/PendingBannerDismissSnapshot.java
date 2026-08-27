package o;

import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes4.dex */
public final class PendingBannerDismissSnapshot {
    public boolean IconCompatParcelizer;
    public boolean MediaDescriptionCompat;
    public boolean RemoteActionCompatParcelizer;
    public boolean read;
    public boolean serializer;
    public boolean write;

    public final void IconCompatParcelizer(boolean z) {
        this.read = z;
    }

    public final boolean IconCompatParcelizer() {
        return this.read;
    }

    public final void MediaMetadataCompat(boolean z) {
        this.MediaDescriptionCompat = z;
    }

    public final boolean MediaMetadataCompat() {
        return this.MediaDescriptionCompat;
    }

    public final void RemoteActionCompatParcelizer(boolean z) {
        this.serializer = z;
    }

    public final boolean RemoteActionCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final void read(boolean z) {
        this.write = z;
    }

    public final boolean read() {
        return this.RemoteActionCompatParcelizer;
    }

    public final void serializer(boolean z) {
        this.IconCompatParcelizer = z;
    }

    public final boolean serializer() {
        return this.write;
    }

    public final void write(boolean z) {
        this.RemoteActionCompatParcelizer = z;
    }

    public final boolean write() {
        return this.serializer;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SentryFeedbackOptions{isNameRequired=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", showName=");
        sb.append(this.write);
        sb.append(", isEmailRequired=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", showEmail=");
        sb.append(this.serializer);
        sb.append(", useSentryUser=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", showBranding=");
        return ff$$ExternalSyntheticOutline0.m(sb, this.read, ", formTitle='Report a Bug', submitButtonLabel='Send Bug Report', cancelButtonLabel='Cancel', nameLabel='Name', namePlaceholder='Your Name', emailLabel='Email', emailPlaceholder='your.email@example.org', isRequiredLabel=' (Required)', messageLabel='Description', messagePlaceholder='What's the bug? What did you expect?'}");
    }
}
