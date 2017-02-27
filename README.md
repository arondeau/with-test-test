# with-test-test

I was curious how to write my tests and implementation together in the same file. 

```clojure
(ns with-test-test.core
  (:require [clojure.test :refer :all]))

(with-test
  (defn my-add [x y] (+ x y))
  (testing "adding two zeros"
    (is (= 0 (my-add 0 0))))
  (testing "adding one and zero"
    (is (= 1 (my-add 0 1)))))
```

# Using with Cider

To run tests fron a non '-test' namespace, you'll need to set 

```lisp
(setq cider-test-infer-test-ns (lambda (ns) ns))
```

in your `~/.emacs.d/init.el`. 

(Found via https://github.com/clojure-emacs/cider/issues/784)

Then, if you have a running REPL with Cider in Emacs, you can hit `CTRL-c ,` to run the tests.

# Run all tests before building

```bash
$ lein test with-test-test.core
```


