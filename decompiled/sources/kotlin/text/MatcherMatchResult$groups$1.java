package kotlin.text;

import androidx.sqlite.SQLite;
import java.util.Iterator;
import java.util.regex.Matcher;
import kotlin.collections.AbstractCollection;
import kotlin.collections.AbstractMap$$ExternalSyntheticLambda0;
import kotlin.ranges.RangesKt;
import o.BackspaceCommand;
import o.ensureSubscribedToInAppMessageEventslambda7;
import o.getInAppMessageStack;
import o.getIsCurrentlyDisplayingInAppMessage;
import o.r8lambdaN7z0Ea2bnxePLVipqp_gDhWww;
import o.verifyOrientationStatuslambda1;
import o.verifyOrientationStatuslambda3;

/* JADX INFO: loaded from: classes4.dex */
public final class MatcherMatchResult$groups$1 extends AbstractCollection {
    public final /* synthetic */ getIsCurrentlyDisplayingInAppMessage write;

    @Override // kotlin.collections.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return false;
    }

    public final getInAppMessageStack RemoteActionCompatParcelizer(int i) {
        Matcher matcher = this.write.IconCompatParcelizer;
        Object[] objArr = {Integer.valueOf(matcher.start(i)), Integer.valueOf(matcher.end(i))};
        int iWrite = BackspaceCommand.write();
        ensureSubscribedToInAppMessageEventslambda7 ensuresubscribedtoinappmessageeventslambda7 = (ensureSubscribedToInAppMessageEventslambda7) RangesKt.read(281231685, BackspaceCommand.write(), BackspaceCommand.write(), objArr, BackspaceCommand.write(), -281231677, iWrite);
        if (ensuresubscribedtoinappmessageeventslambda7.write < 0) {
            return null;
        }
        String strGroup = matcher.group(i);
        strGroup.getClass();
        return new getInAppMessageStack(strGroup, ensuresubscribedtoinappmessageeventslambda7);
    }

    @Override // kotlin.collections.AbstractCollection
    public final int getSize() {
        return this.write.IconCompatParcelizer.groupCount() + 1;
    }

    public MatcherMatchResult$groups$1(getIsCurrentlyDisplayingInAppMessage getiscurrentlydisplayinginappmessage) {
        this.write = getiscurrentlydisplayinginappmessage;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean contains(Object obj) {
        if (obj == null || (obj instanceof getInAppMessageStack)) {
            return super.contains((getInAppMessageStack) obj);
        }
        return false;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new verifyOrientationStatuslambda1(new verifyOrientationStatuslambda3(new r8lambdaN7z0Ea2bnxePLVipqp_gDhWww(1, SQLite.write(this)), new AbstractMap$$ExternalSyntheticLambda0(2, this)));
    }
}
