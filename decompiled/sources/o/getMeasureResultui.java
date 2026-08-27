package o;

import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public interface getMeasureResultui {
    AbstractComposeViewExternalSyntheticLambda0 IconCompatParcelizer(LookaheadCapablePlaceableCompaniononCommitAffectingRuler1 lookaheadCapablePlaceableCompaniononCommitAffectingRuler1);

    AbstractComposeViewExternalSyntheticLambda0 RemoteActionCompatParcelizer(LookaheadCapablePlaceableCompaniononCommitAffectingRuler1 lookaheadCapablePlaceableCompaniononCommitAffectingRuler1);

    updatePlacedUnderMotionFrameOfReference serializer(LookaheadCapablePlaceableCompaniononCommitAffectingRuler1 lookaheadCapablePlaceableCompaniononCommitAffectingRuler1);

    default Set read(LookaheadCapablePlaceableCompaniononCommitAffectingRuler1 lookaheadCapablePlaceableCompaniononCommitAffectingRuler1) {
        return (Set) RemoteActionCompatParcelizer(lookaheadCapablePlaceableCompaniononCommitAffectingRuler1).write();
    }

    default updatePlacedUnderMotionFrameOfReference serializer(Class cls) {
        return serializer(LookaheadCapablePlaceableCompaniononCommitAffectingRuler1.read(cls));
    }

    default AbstractComposeViewExternalSyntheticLambda0 write(Class cls) {
        return IconCompatParcelizer(LookaheadCapablePlaceableCompaniononCommitAffectingRuler1.read(cls));
    }

    default Object write(LookaheadCapablePlaceableCompaniononCommitAffectingRuler1 lookaheadCapablePlaceableCompaniononCommitAffectingRuler1) {
        AbstractComposeViewExternalSyntheticLambda0 abstractComposeViewExternalSyntheticLambda0IconCompatParcelizer = IconCompatParcelizer(lookaheadCapablePlaceableCompaniononCommitAffectingRuler1);
        if (abstractComposeViewExternalSyntheticLambda0IconCompatParcelizer == null) {
            return null;
        }
        return abstractComposeViewExternalSyntheticLambda0IconCompatParcelizer.write();
    }

    default Object read(Class cls) {
        return write(LookaheadCapablePlaceableCompaniononCommitAffectingRuler1.read(cls));
    }
}
