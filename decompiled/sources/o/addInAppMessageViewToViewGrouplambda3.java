package o;

import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class addInAppMessageViewToViewGrouplambda3 implements Iterator, displayInAppMessagelambda121 {
    public final closelambda0 IconCompatParcelizer;
    public final /* synthetic */ int RemoteActionCompatParcelizer;

    public addInAppMessageViewToViewGrouplambda3(addInAppMessageViewToViewGrouplambda22 addinappmessageviewtoviewgrouplambda22, int i) {
        this.RemoteActionCompatParcelizer = i;
        addinappmessageviewtoviewgrouplambda22.getClass();
        if (i == 1) {
            this.IconCompatParcelizer = new closelambda0(addinappmessageviewtoviewgrouplambda22.IconCompatParcelizer, addinappmessageviewtoviewgrouplambda22);
        } else if (i != 2) {
            this.IconCompatParcelizer = new closelambda0(addinappmessageviewtoviewgrouplambda22.IconCompatParcelizer, addinappmessageviewtoviewgrouplambda22);
        } else {
            this.IconCompatParcelizer = new closelambda0(addinappmessageviewtoviewgrouplambda22.IconCompatParcelizer, addinappmessageviewtoviewgrouplambda22);
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.RemoteActionCompatParcelizer;
        closelambda0 closelambda0Var = this.IconCompatParcelizer;
        if (i == 0) {
            closelambda0Var.next();
            return closelambda0Var.RemoteActionCompatParcelizer;
        }
        if (i != 1) {
            return closelambda0Var.next().write;
        }
        return new r8lambdaVZe7H5z6ClbV3hZjfK9rquExLiM(closelambda0Var.IconCompatParcelizer.write, closelambda0Var.RemoteActionCompatParcelizer, closelambda0Var.next());
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.RemoteActionCompatParcelizer;
        if (i != 0) {
            return i != 1 ? this.IconCompatParcelizer.hasNext() : this.IconCompatParcelizer.hasNext();
        }
        return this.IconCompatParcelizer.hasNext();
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.RemoteActionCompatParcelizer;
        if (i == 0) {
            this.IconCompatParcelizer.remove();
        } else if (i != 1) {
            this.IconCompatParcelizer.remove();
        } else {
            this.IconCompatParcelizer.remove();
        }
    }
}
