package o;

import bo.app.ff$$ExternalSyntheticOutline0;
import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public final class ImageOnlyContentCardView implements TextAnnouncementContentCardView, Serializable {
    public final ShortNewsContentCardViewViewHolder IconCompatParcelizer;
    public final TextAnnouncementContentCardView serializer;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageOnlyContentCardView)) {
            return false;
        }
        ImageOnlyContentCardView imageOnlyContentCardView = (ImageOnlyContentCardView) obj;
        int i = 2;
        ImageOnlyContentCardView imageOnlyContentCardView2 = imageOnlyContentCardView;
        int i2 = 2;
        while (true) {
            TextAnnouncementContentCardView textAnnouncementContentCardView = imageOnlyContentCardView2.serializer;
            imageOnlyContentCardView2 = textAnnouncementContentCardView instanceof ImageOnlyContentCardView ? (ImageOnlyContentCardView) textAnnouncementContentCardView : null;
            if (imageOnlyContentCardView2 == null) {
                break;
            }
            i2++;
        }
        ImageOnlyContentCardView imageOnlyContentCardView3 = this;
        while (true) {
            TextAnnouncementContentCardView textAnnouncementContentCardView2 = imageOnlyContentCardView3.serializer;
            imageOnlyContentCardView3 = textAnnouncementContentCardView2 instanceof ImageOnlyContentCardView ? (ImageOnlyContentCardView) textAnnouncementContentCardView2 : null;
            if (imageOnlyContentCardView3 == null) {
                break;
            }
            i++;
        }
        if (i2 != i) {
            return false;
        }
        ImageOnlyContentCardView imageOnlyContentCardView4 = this;
        while (true) {
            ShortNewsContentCardViewViewHolder shortNewsContentCardViewViewHolder = imageOnlyContentCardView4.IconCompatParcelizer;
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{imageOnlyContentCardView.get(shortNewsContentCardViewViewHolder.getKey()), shortNewsContentCardViewViewHolder}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            TextAnnouncementContentCardView textAnnouncementContentCardView3 = imageOnlyContentCardView4.serializer;
            if (!(textAnnouncementContentCardView3 instanceof ImageOnlyContentCardView)) {
                textAnnouncementContentCardView3.getClass();
                ShortNewsContentCardViewViewHolder shortNewsContentCardViewViewHolder2 = (ShortNewsContentCardViewViewHolder) textAnnouncementContentCardView3;
                return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{imageOnlyContentCardView.get(shortNewsContentCardViewViewHolder2.getKey()), shortNewsContentCardViewViewHolder2}, getCieXyz.write())).booleanValue();
            }
            imageOnlyContentCardView4 = (ImageOnlyContentCardView) textAnnouncementContentCardView3;
        }
    }

    @Override // o.TextAnnouncementContentCardView
    public final Object fold(Object obj, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
        return r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.invoke(this.serializer.fold(obj, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0), this.IconCompatParcelizer);
    }

    public final int hashCode() {
        return this.IconCompatParcelizer.hashCode() + this.serializer.hashCode();
    }

    public ImageOnlyContentCardView(ShortNewsContentCardViewViewHolder shortNewsContentCardViewViewHolder, TextAnnouncementContentCardView textAnnouncementContentCardView) {
        textAnnouncementContentCardView.getClass();
        shortNewsContentCardViewViewHolder.getClass();
        this.serializer = textAnnouncementContentCardView;
        this.IconCompatParcelizer = shortNewsContentCardViewViewHolder;
    }

    @Override // o.TextAnnouncementContentCardView
    public final ShortNewsContentCardViewViewHolder get(ImageOnlyContentCardViewViewHolder imageOnlyContentCardViewViewHolder) {
        imageOnlyContentCardViewViewHolder.getClass();
        ImageOnlyContentCardView imageOnlyContentCardView = this;
        while (true) {
            ShortNewsContentCardViewViewHolder shortNewsContentCardViewViewHolder = imageOnlyContentCardView.IconCompatParcelizer.get(imageOnlyContentCardViewViewHolder);
            if (shortNewsContentCardViewViewHolder != null) {
                return shortNewsContentCardViewViewHolder;
            }
            TextAnnouncementContentCardView textAnnouncementContentCardView = imageOnlyContentCardView.serializer;
            if (!(textAnnouncementContentCardView instanceof ImageOnlyContentCardView)) {
                return textAnnouncementContentCardView.get(imageOnlyContentCardViewViewHolder);
            }
            imageOnlyContentCardView = (ImageOnlyContentCardView) textAnnouncementContentCardView;
        }
    }

    @Override // o.TextAnnouncementContentCardView
    public final TextAnnouncementContentCardView minusKey(ImageOnlyContentCardViewViewHolder imageOnlyContentCardViewViewHolder) {
        imageOnlyContentCardViewViewHolder.getClass();
        ShortNewsContentCardViewViewHolder shortNewsContentCardViewViewHolder = this.IconCompatParcelizer;
        ShortNewsContentCardViewViewHolder shortNewsContentCardViewViewHolder2 = shortNewsContentCardViewViewHolder.get(imageOnlyContentCardViewViewHolder);
        TextAnnouncementContentCardView textAnnouncementContentCardView = this.serializer;
        if (shortNewsContentCardViewViewHolder2 != null) {
            return textAnnouncementContentCardView;
        }
        TextAnnouncementContentCardView textAnnouncementContentCardViewMinusKey = textAnnouncementContentCardView.minusKey(imageOnlyContentCardViewViewHolder);
        if (textAnnouncementContentCardViewMinusKey == textAnnouncementContentCardView) {
            return this;
        }
        return textAnnouncementContentCardViewMinusKey == r8lambda2qMxD75IpTxKfLD4RjAbqEmoamc.write ? shortNewsContentCardViewViewHolder : new ImageOnlyContentCardView(shortNewsContentCardViewViewHolder, textAnnouncementContentCardViewMinusKey);
    }

    @Override // o.TextAnnouncementContentCardView
    public final TextAnnouncementContentCardView plus(TextAnnouncementContentCardView textAnnouncementContentCardView) {
        textAnnouncementContentCardView.getClass();
        return textAnnouncementContentCardView == r8lambda2qMxD75IpTxKfLD4RjAbqEmoamc.write ? this : (TextAnnouncementContentCardView) textAnnouncementContentCardView.fold(this, new DefaultContentCardView(26));
    }

    public final String toString() {
        return ff$$ExternalSyntheticOutline0.m(new StringBuilder("["), (String) fold("", new DefaultContentCardView(0)), ']');
    }
}
