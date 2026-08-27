package androidx.compose.ui;

import androidx.compose.ui.platform.InspectableValueKt;
import io.reactivex.subjects.BehaviorSubject;
import o.getBirthDateFull;
import o.getPostalCode;
import o.pauseWebviewIfNecessarylambda10;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;

/* JADX INFO: loaded from: classes.dex */
public final class ComposedModifierKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier materializeImpl(getBirthDateFull getbirthdatefull, Modifier modifier) {
        if (modifier.all(new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.ComposedModifierKt.materializeImpl.1
            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public final Boolean invoke(Modifier.Element element) {
                return Boolean.valueOf(!(element instanceof ComposedModifier));
            }
        })) {
            return modifier;
        }
        final getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.write(1219399079);
        Modifier modifier2 = (Modifier) modifier.foldIn(Modifier.Companion, new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: androidx.compose.ui.ComposedModifierKt$materializeImpl$result$1
            {
                super(2);
            }

            @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
            public final Modifier invoke(Modifier modifier3, Modifier.Element element) {
                boolean z = element instanceof ComposedModifier;
                Modifier modifierMaterializeImpl = element;
                if (z) {
                    r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY factory = ((ComposedModifier) element).getFactory();
                    factory.getClass();
                    int iWrite = BehaviorSubject.BehaviorDisposable.write();
                    int iWrite2 = BehaviorSubject.BehaviorDisposable.write();
                    pauseWebviewIfNecessarylambda10.read(BehaviorSubject.BehaviorDisposable.write(), new Object[]{3, factory}, BehaviorSubject.BehaviorDisposable.write(), iWrite, -722072991, 722072991, iWrite2);
                    modifierMaterializeImpl = ComposedModifierKt.materializeImpl(getpostalcode, (Modifier) factory.invoke(Modifier.Companion, getpostalcode, 0));
                }
                return modifier3.then(modifierMaterializeImpl);
            }
        });
        getpostalcode.IconCompatParcelizer(false);
        return modifier2;
    }

    public static /* synthetic */ Modifier composed$default(Modifier modifier, String str, Object obj, Object obj2, Object obj3, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, int i, Object obj4) {
        if ((i & 16) != 0) {
            r8lambdaunavo3sxub_pc9xroryotnrlvsm = InspectableValueKt.getNoInspectorInfo();
        }
        return composed(modifier, str, obj, obj2, obj3, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry);
    }

    public static final Modifier materializeModifier(getBirthDateFull getbirthdatefull, Modifier modifier) {
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.serializer(439770924);
        Modifier modifierMaterializeImpl = materializeImpl(getpostalcode, modifier);
        getpostalcode.IconCompatParcelizer(false);
        return modifierMaterializeImpl;
    }

    public static final Modifier composed(Modifier modifier, String str, Object obj, Object obj2, Object obj3, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry) {
        return modifier.then(new KeyedComposedModifier3(str, obj, obj2, obj3, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry));
    }

    public static final Modifier materializeWithCompositionLocalInjectionInternal(getBirthDateFull getbirthdatefull, Modifier modifier) {
        return modifier == Modifier.Companion ? modifier : materializeModifier(getbirthdatefull, new CompositionLocalMapInjectionElement(((getPostalCode) getbirthdatefull).serializer()).then(modifier));
    }

    public static final Modifier composed(Modifier modifier, String str, Object obj, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry) {
        return modifier.then(new KeyedComposedModifier1(str, obj, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry));
    }

    public static final Modifier composed(Modifier modifier, String str, Object obj, Object obj2, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry) {
        return modifier.then(new KeyedComposedModifier2(str, obj, obj2, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry));
    }

    public static final Modifier composed(Modifier modifier, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry) {
        return modifier.then(new ComposedModifier(r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry));
    }

    public static final Modifier composed(Modifier modifier, String str, Object[] objArr, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry) {
        return modifier.then(new KeyedComposedModifierN(str, objArr, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry));
    }

    public static /* synthetic */ Modifier composed$default(Modifier modifier, String str, Object obj, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, int i, Object obj2) {
        if ((i & 4) != 0) {
            r8lambdaunavo3sxub_pc9xroryotnrlvsm = InspectableValueKt.getNoInspectorInfo();
        }
        return composed(modifier, str, obj, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry);
    }

    public static /* synthetic */ Modifier composed$default(Modifier modifier, String str, Object obj, Object obj2, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, int i, Object obj3) {
        if ((i & 8) != 0) {
            r8lambdaunavo3sxub_pc9xroryotnrlvsm = InspectableValueKt.getNoInspectorInfo();
        }
        return composed(modifier, str, obj, obj2, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry);
    }

    public static /* synthetic */ Modifier composed$default(Modifier modifier, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, int i, Object obj) {
        if ((i & 1) != 0) {
            r8lambdaunavo3sxub_pc9xroryotnrlvsm = InspectableValueKt.getNoInspectorInfo();
        }
        return composed(modifier, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry);
    }

    public static /* synthetic */ Modifier composed$default(Modifier modifier, String str, Object[] objArr, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, int i, Object obj) {
        if ((i & 4) != 0) {
            r8lambdaunavo3sxub_pc9xroryotnrlvsm = InspectableValueKt.getNoInspectorInfo();
        }
        return composed(modifier, str, objArr, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry);
    }
}
