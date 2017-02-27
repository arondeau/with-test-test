# with-test-test

I was curious how to write my tests and implementation together in the same file. 

```clojure
(with-test
    (defn my-function [x y]
      (+ x y))
  (is (= 4 (my-function 2 2)))
  (is (= 7 (my-function 3 4))))
```

# Cider

You'll need to set (setq cider-test-infer-test-ns (lambda (ns) ns)) in ~/.emacs.d/init.el, found via https://github.com/clojure-emacs/cider/issues/784

Then you can run <CTRL-c ,> to run the tests.

# Run all tests before building

lein test with-test-test.core
