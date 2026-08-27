package o;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambdar6hmn7s38s541cNhRcJS8k4uprc implements InvocationHandler {
    public String RemoteActionCompatParcelizer;
    public final ArrayList serializer;
    public boolean write;

    public r8lambdar6hmn7s38s541cNhRcJS8k4uprc(ArrayList arrayList) {
        this.serializer = arrayList;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        String name = method.getName();
        Class<?> returnType = method.getReturnType();
        if (objArr == null) {
            objArr = r8lambdayLhLVWHiWt8zzmWjqiTGBD6PCw0.IconCompatParcelizer;
        }
        if (name.equals("supports") && Boolean.TYPE == returnType) {
            return Boolean.TRUE;
        }
        if (name.equals("unsupported") && Void.TYPE == returnType) {
            this.write = true;
            return null;
        }
        boolean zEquals = name.equals("protocols");
        ArrayList arrayList = this.serializer;
        if (zEquals && objArr.length == 0) {
            return arrayList;
        }
        if ((name.equals("selectProtocol") || name.equals("select")) && String.class == returnType && objArr.length == 1) {
            Object obj2 = objArr[0];
            if (obj2 instanceof List) {
                List list = (List) obj2;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    if (arrayList.contains(list.get(i))) {
                        String str = (String) list.get(i);
                        this.RemoteActionCompatParcelizer = str;
                        return str;
                    }
                }
                String str2 = (String) arrayList.get(0);
                this.RemoteActionCompatParcelizer = str2;
                return str2;
            }
        }
        if ((!name.equals("protocolSelected") && !name.equals("selected")) || objArr.length != 1) {
            return method.invoke(this, objArr);
        }
        this.RemoteActionCompatParcelizer = (String) objArr[0];
        return null;
    }
}
