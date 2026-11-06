# Iteration 3: generate candidate keys

The outfit program visits all 72 choices of shirt, pants, and shoes.
Its clothing rule allows 66 outfits. The innermost loop and print statement
therefore have different execution counts.
Plan a driver that visits every required choice for Code Breakers.
For this key search, visit every combination in the ranges below.

The challenge uses exactly one Caesar shift (C), one repeating three-digit key (K),
and one reversal (R). The encryption order and numerical keys are unknown.

| Choice | Required values |
|---|---|
| Encryption order | CKR, CRK, KCR, KRC, RCK, RKC |
| Caesar key | 0 through 25, inclusive |
| Signed repeating key | -999 through 999, inclusive |

1. Match the three outfit loops to the three choices above.
2. Predict the number of key-and-order combinations. Include both endpoints of each range.
3. Write pseudocode in `KeySearchPlan.java` during the class discussion.
4. First plan a counter that increases once per combination. Decide its expected final value.
5. Then describe how each combination produces a candidate plaintext and a score.
6. Describe how the program retains the best candidate and its encryption chain.

Undo a proposed encryption chain in reverse order. Undo C and K with the opposite
shift. Undo R with another reversal. Start each attempt with the original ciphertext.
Different key-and-order combinations can produce the same plaintext.

Keep your earlier project files. Implement the final search in
`breakCode(String ciphertext)` in your existing `CodeBreakers3.java`.
Use your own completed cipher methods. Keep its supplied `main` unchanged.

The teacher demonstration lives in this template. Existing student repositories
do not receive template changes automatically. Open this folder on GitHub to read
the example or copy these new files into your existing repository.

At the end of the class demonstration, the teacher commits and pushes the class
pseudocode. Refresh this folder and open the new commit to see that progress.
