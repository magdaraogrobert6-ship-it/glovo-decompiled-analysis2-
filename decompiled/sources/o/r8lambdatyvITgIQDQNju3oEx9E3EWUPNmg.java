package o;

import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdatyvITgIQDQNju3oEx9E3EWUPNmg implements r8lambdaec7JQlABsI5gwAMVoMflnmYsd7o {
    public final StateFlow IconCompatParcelizer;
    public final MutableStateFlow serializer;

    public r8lambdatyvITgIQDQNju3oEx9E3EWUPNmg(r8lambdasr5bVOa2Di9thfD9WpM7Q9rULYM r8lambdasr5bvoa2di9thfd9wpm7q9rulym) {
        MutableStateFlow mutableStateFlow = StateFlowKt.read(r8lambdasr5bvoa2di9thfd9wpm7q9rulym);
        this.serializer = mutableStateFlow;
        this.IconCompatParcelizer = mutableStateFlow;
    }
}
