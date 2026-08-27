package o;

import java.util.List;
import java.util.regex.Matcher;
import kotlin.collections.ReversedListReadOnly;
import kotlin.ranges.RangesKt;
import kotlin.text.MatcherMatchResult$groups$1;
import kotlin.text.RegexKt;

/* JADX INFO: loaded from: classes4.dex */
public final class getIsCurrentlyDisplayingInAppMessage {
    public final Matcher IconCompatParcelizer;
    public ReversedListReadOnly read;
    public final CharSequence serializer;
    public final MatcherMatchResult$groups$1 write;

    public final getIsCurrentlyDisplayingInAppMessage RemoteActionCompatParcelizer() {
        Matcher matcher = this.IconCompatParcelizer;
        int iEnd = matcher.end() + (matcher.end() == matcher.start() ? 1 : 0);
        CharSequence charSequence = this.serializer;
        if (iEnd > charSequence.length()) {
            return null;
        }
        Matcher matcher2 = matcher.pattern().matcher(charSequence);
        matcher2.getClass();
        return RegexKt.write(matcher2, iEnd, charSequence);
    }

    public final ensureSubscribedToInAppMessageEventslambda7 serializer() {
        Matcher matcher = this.IconCompatParcelizer;
        Object[] objArr = {Integer.valueOf(matcher.start()), Integer.valueOf(matcher.end())};
        int iWrite = BackspaceCommand.write();
        return (ensureSubscribedToInAppMessageEventslambda7) RangesKt.read(281231685, BackspaceCommand.write(), BackspaceCommand.write(), objArr, BackspaceCommand.write(), -281231677, iWrite);
    }

    public final String write() {
        String strGroup = this.IconCompatParcelizer.group();
        strGroup.getClass();
        return strGroup;
    }

    public getIsCurrentlyDisplayingInAppMessage(Matcher matcher, CharSequence charSequence) {
        charSequence.getClass();
        this.IconCompatParcelizer = matcher;
        this.serializer = charSequence;
        this.write = new MatcherMatchResult$groups$1(this);
    }

    public final List IconCompatParcelizer() {
        if (this.read == null) {
            this.read = new ReversedListReadOnly(this);
        }
        ReversedListReadOnly reversedListReadOnly = this.read;
        reversedListReadOnly.getClass();
        return reversedListReadOnly;
    }
}
