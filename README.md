# BlockChain

A simple Java project that demonstrates the basic idea behind how a blockchain works.

This project creates a block structure, generates hashes using SHA-256, and shows how block data can be linked through hashes. It is a beginner-friendly implementation meant to help understand the core concepts of blockchain in Java.

## Features

- Creates a basic `Block` object
- Stores block data
- Stores the previous block’s hash
- Generates a unique hash using SHA-256
- Uses timestamps in hash generation
- Includes a utility class for hashing

## Project Structure

```text
BlockChain/
├── src/
│   ├── Block.java
│   ├── Chain.java
│   └── StringUtil.java
├── .gitignore
└── Block Chain.iml
