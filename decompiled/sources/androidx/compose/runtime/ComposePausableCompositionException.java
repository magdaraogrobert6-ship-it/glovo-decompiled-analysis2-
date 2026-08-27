package androidx.compose.runtime;

import androidx.sqlite.SQLite;
import java.util.ArrayList;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.sequences.SequenceBuilderIterator;
import o.ContentInViewNode;
import o.ScrollingLayoutElement;
import o.getQueryParameterslambda2;
import o.instance_delegatelambda0;
import o.isCurrentlyDisplayingInAppMessage;
import o.onContentCardDismissed;

/* JADX INFO: loaded from: classes.dex */
public final class ComposePausableCompositionException extends RuntimeException {
    public final ScrollingLayoutElement IconCompatParcelizer;
    public final ContentInViewNode read;
    public final int serializer;
    public final ContentInViewNode write;

    public ComposePausableCompositionException(ContentInViewNode contentInViewNode, ContentInViewNode contentInViewNode2, ScrollingLayoutElement scrollingLayoutElement, int i, Exception exc) {
        super(exc);
        this.write = contentInViewNode;
        this.read = contentInViewNode2;
        this.IconCompatParcelizer = scrollingLayoutElement;
        this.serializer = i;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        List list;
        StringBuilder sb = new StringBuilder("\n            |Failed to execute op number ");
        sb.append(this.serializer);
        sb.append(":\n            |");
        SequenceBuilderIterator sequenceBuilderIterator = LazyKt__LazyJVMKt.read(new ComposePausableCompositionException$operationsSequence$1(this, null));
        if (!sequenceBuilderIterator.hasNext()) {
            list = instance_delegatelambda0.write;
        } else {
            Object next = sequenceBuilderIterator.next();
            if (!sequenceBuilderIterator.hasNext()) {
                int iSerializer = getQueryParameterslambda2.serializer();
                int iSerializer2 = getQueryParameterslambda2.serializer();
                list = (List) SQLite.write(getQueryParameterslambda2.serializer(), iSerializer2, 516583654, new Object[]{next}, getQueryParameterslambda2.serializer(), -516583649, iSerializer);
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(next);
                while (sequenceBuilderIterator.hasNext()) {
                    arrayList.add(sequenceBuilderIterator.next());
                }
                list = arrayList;
            }
        }
        sb.append(onContentCardDismissed.IconCompatParcelizer(onContentCardDismissed.IconCompatParcelizer(50, list), "\n", null, null, null, 62));
        sb.append("\n            ");
        return isCurrentlyDisplayingInAppMessage.MediaDescriptionCompat(sb.toString());
    }
}
