import jdk.nashorn.internal.ir.annotations.Immutable;

@Immutable
public final class No_stack_trace_exception extends Exception
    {
        No_stack_trace_exception()
        {}
        @Override
        public Throwable fillInStackTrace()
        {
            return this;
        }
    }
