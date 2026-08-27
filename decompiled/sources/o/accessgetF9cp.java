package o;

import android.content.Context;
import androidx.cardview.widget.CardView$1;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class accessgetF9cp {
    public final androidx.emoji2.text.EmojiProcessor IconCompatParcelizer;
    public final CardView$1 RemoteActionCompatParcelizer;
    public final HashMap read;

    public final accessgetForwardcp IconCompatParcelizer(String str) {
        synchronized (this) {
            if (this.read.containsKey(str)) {
                return (accessgetForwardcp) this.read.get(str);
            }
            CctBackendFactory cctBackendFactorySerializer = this.RemoteActionCompatParcelizer.serializer(str);
            if (cctBackendFactorySerializer == null) {
                return null;
            }
            androidx.emoji2.text.EmojiProcessor emojiProcessor = this.IconCompatParcelizer;
            accessgetForwardcp accessgetforwardcpCreate = cctBackendFactorySerializer.create(new accessgetF6cp((Context) emojiProcessor.serializer, (accessgetMediaPlaycp) emojiProcessor.read, (accessgetMediaPlaycp) emojiProcessor.IconCompatParcelizer, str));
            this.read.put(str, accessgetforwardcpCreate);
            return accessgetforwardcpCreate;
        }
    }

    public accessgetF9cp(Context context, androidx.emoji2.text.EmojiProcessor emojiProcessor) {
        CardView$1 cardView$1 = new CardView$1(context, 25);
        this.read = new HashMap();
        this.RemoteActionCompatParcelizer = cardView$1;
        this.IconCompatParcelizer = emojiProcessor;
    }
}
