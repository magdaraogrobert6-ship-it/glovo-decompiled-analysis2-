package androidx.compose.ui.node;

import androidx.compose.ui.Actual_jvmAndAndroidKt;
import androidx.compose.ui.CombinedModifier;
import androidx.compose.ui.Modifier;
import o.getCieXyz;
import o.onCreateVirtualViewTranslationRequests;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public final class NodeChainKt {
    private static final int ActionReplace = 0;
    private static final int ActionReuse = 2;
    private static final int ActionUpdate = 1;

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends Modifier.Node> void updateUnsafe(ModifierNodeElement<T> modifierNodeElement, Modifier.Node node) {
        node.getClass();
        modifierNodeElement.update(node);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final onCreateVirtualViewTranslationRequests fillVector(Modifier modifier, final onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests, onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests2) {
        oncreatevirtualviewtranslationrequests2.IconCompatParcelizer(modifier);
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = null;
        while (true) {
            int i = oncreatevirtualviewtranslationrequests2.read;
            if (i == 0) {
                return oncreatevirtualviewtranslationrequests;
            }
            Modifier modifier2 = (Modifier) oncreatevirtualviewtranslationrequests2.write(i - 1);
            if (modifier2 instanceof CombinedModifier) {
                CombinedModifier combinedModifier = (CombinedModifier) modifier2;
                oncreatevirtualviewtranslationrequests2.IconCompatParcelizer(combinedModifier.getInner$ui());
                oncreatevirtualviewtranslationrequests2.IconCompatParcelizer(combinedModifier.getOuter$ui());
            } else if (modifier2 instanceof Modifier.Element) {
                oncreatevirtualviewtranslationrequests.IconCompatParcelizer(modifier2);
            } else {
                if (r8lambdaunavo3sxub_pc9xroryotnrlvsm == null) {
                    r8lambdaunavo3sxub_pc9xroryotnrlvsm = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.node.NodeChainKt.fillVector.1
                        @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                        public final Boolean invoke(Modifier.Element element) {
                            oncreatevirtualviewtranslationrequests.IconCompatParcelizer(element);
                            return Boolean.TRUE;
                        }

                        {
                            super(1);
                        }
                    };
                }
                modifier2.all(r8lambdaunavo3sxub_pc9xroryotnrlvsm);
            }
        }
    }

    public static final int actionForModifiers(Modifier.Element element, Modifier.Element element2) {
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{element, element2}, getCieXyz.write())).booleanValue()) {
            return 2;
        }
        return Actual_jvmAndAndroidKt.areObjectsOfSameType(element, element2) ? 1 : 0;
    }
}
