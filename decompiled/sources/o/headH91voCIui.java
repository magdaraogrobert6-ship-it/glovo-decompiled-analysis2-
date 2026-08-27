package o;

import com.google.firebase.firestore.FirebaseFirestore;
import com.mapbox.navigation.voice.api.MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class headH91voCIui extends tailToHeadaLcG6gQui {
    public final headToTailui IconCompatParcelizer(String str) {
        onPreAttach.serializer(str, "Provided document path must not be null.");
        shareWithSiblings sharewithsiblings = this.IconCompatParcelizer.MediaSessionCompatQueueItem;
        shareWithSiblings sharewithsiblingsIconCompatParcelizer = shareWithSiblings.IconCompatParcelizer(str);
        sharewithsiblings.getClass();
        ArrayList arrayList = new ArrayList(sharewithsiblings.IconCompatParcelizer);
        arrayList.addAll(sharewithsiblingsIconCompatParcelizer.IconCompatParcelizer);
        shareWithSiblings sharewithsiblings2 = (shareWithSiblings) sharewithsiblings.serializer(arrayList);
        if (sharewithsiblings2.IconCompatParcelizer.size() % 2 == 0) {
            return new headToTailui(new visitNodes(sharewithsiblings2), this.write);
        }
        MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0.m(sharewithsiblings2.IconCompatParcelizer.size(), sharewithsiblings2.write(), " has ", "Invalid document reference. Document references must have an even number of segments, but ");
        return null;
    }

    public headH91voCIui(accessgetPointerInputSourcecp accessgetpointerinputsourcecp, FirebaseFirestore firebaseFirestore) {
        super(accessgetpointerinputsourcecp, firebaseFirestore);
    }
}
