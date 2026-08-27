package o;

import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdafOIPryYKxSg19oxLSCcW3X8q4Qk implements r8lambdaec7JQlABsI5gwAMVoMflnmYsd7o {
    public final StateFlow read;
    public final r8lambdawI45rd1s84hSyTy4WOY_JqhFAy8 serializer;
    public final MutableStateFlow write;

    public r8lambdafOIPryYKxSg19oxLSCcW3X8q4Qk(r8lambdawI45rd1s84hSyTy4WOY_JqhFAy8 r8lambdawi45rd1s84hsyty4woy_jqhfay8, r8lambdag0m0JVUE1KB8aI8kjJMGJSHe1o8 r8lambdag0m0jvue1kb8ai8kjjmgjshe1o8) {
        r8lambdawi45rd1s84hsyty4woy_jqhfay8.getClass();
        this.serializer = r8lambdawi45rd1s84hsyty4woy_jqhfay8;
        MutableStateFlow mutableStateFlow = StateFlowKt.read(r8lambdag0m0jvue1kb8ai8kjjmgjshe1o8);
        this.write = mutableStateFlow;
        this.read = mutableStateFlow;
        mutableStateFlow.IconCompatParcelizer(r8lambdag0m0jvue1kb8ai8kjjmgjshe1o8);
    }
}
